package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.Privilege;
import com.linh.apps.cms_movie.bean.PrivilegeExample;
import com.linh.apps.cms_movie.dao.PrivilegeMapper;
import com.linh.apps.cms_movie.dao.extend.PrivilegeExtendMapper;
import com.linh.apps.cms_movie.service.IPrivilegeService;
import com.linh.apps.cms_movie.vm.PrivilegeTree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PrivilegeServiceImpl implements IPrivilegeService {
    @Resource
    private PrivilegeMapper privilegeMapper;
    @Resource
    private PrivilegeExtendMapper privilegeExtendMapper;

    @Override
    public List<Privilege> findByUserId(long id) {
        return privilegeExtendMapper.selectByUserId(id);
    }
    @Override
    public List<Privilege> findAll() {
        return privilegeMapper.selectByExample(new PrivilegeExample());
    }

    @Override
    public void saveOrUpdate(Privilege privilege) {
         if(privilege.getId()!=null){
             privilegeMapper.updateByPrimaryKey(privilege);
         }else{
             privilegeMapper.insert(privilege);
         }
    }

    @Override
    public List<Privilege> findByParentId(Long parentId) {
        PrivilegeExample example = new PrivilegeExample();
        if(parentId==null){
            example.createCriteria().andParentIdIsNull();
        }else{
            example.createCriteria().andParentIdEqualTo(parentId);
        }
        return privilegeMapper.selectByExample(example);
    }

    @Override
    public List<PrivilegeTree> findPrivilegeTree() {
        return privilegeExtendMapper.selectAll();
    }
}
