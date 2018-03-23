package pw.mr03.oktalia.logic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.oktalia.entity.Admin;
import pw.mr03.oktalia.mapper.AdminMapper;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class AdminService implements AdminMapper {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> getById(Integer id) {
        return adminMapper.getById(id);
    }

    @Override
    public List<Admin> getByTest(Integer id) {
        return adminMapper.getByTest(id);
    }
}