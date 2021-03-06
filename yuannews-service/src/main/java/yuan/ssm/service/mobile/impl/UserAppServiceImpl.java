package yuan.ssm.service.mobile.impl;

import org.springframework.beans.factory.annotation.Autowired;
import yuan.ssm.common.util.DateUtil;
import yuan.ssm.common.util.FontImageUtil;
import yuan.ssm.common.util.StringUtil;
import yuan.ssm.dao.customer.NewsMapper;
import yuan.ssm.dao.manager.UserManagerMapper;
import yuan.ssm.service.mobile.UserAppService;
import yuan.ssm.vo.LikedVo;

import java.util.List;
import java.util.UUID;

/**
 * Created by yuan on 16-4-4.
 * 服务层　－　移动端　－　用户接口 - 接口实现
 */
public class UserAppServiceImpl implements UserAppService{


    @Autowired
    private UserManagerMapper userManagerMapper;

    @Autowired
    private NewsMapper newsMapper;

    /**
     * 修改用户密码
     * @param id
     * @param newPass
     * @return
     * @throws Exception
     */
    public Integer updateUserPass(Integer id, String newPass) throws Exception {
        return userManagerMapper.updateUserPass(id,newPass);
    }

    /**
     * 修改用户头像
     * @param id 用户id
     * @param newHead 新头像
     * @return 状态
     * @throws Exception
     */
    public Integer updateUserHead(Integer id, String newHead) throws Exception {
        return userManagerMapper.updateUserHead(id,newHead);
    }

    /**
     * 查询
     * @param nid 新闻id
     * @return list
     * @throws Exception
     */
    public List<LikedVo> getLikedUserIfo(Integer nid) throws Exception {
        return newsMapper.findLikedNid(nid);
    }
}
