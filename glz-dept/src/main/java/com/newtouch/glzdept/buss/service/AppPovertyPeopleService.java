package com.newtouch.glzdept.buss.service;

import com.newtouch.common.entity.base.Page;
import com.newtouch.glzdept.buss.entity.PO.PovertyPeoplePO;
import com.newtouch.glzdept.buss.entity.VO.PovertyPeopleVO;

/**
 * @author: lgyu6
 * @date: 2019/3/9 下午4:26
 * project:glz-dept
 */
public interface AppPovertyPeopleService {

    /**
     * 新增一个贫困户信息
     * @param povertyPeopleVO
     */
    void addPovertyUser(PovertyPeopleVO povertyPeopleVO);

    /**
     * 查询贫困户详细信息（无图片）
     * @param povertyPeopleVO
     */
    PovertyPeoplePO povertyInfo(PovertyPeopleVO povertyPeopleVO);

    /**
     * 修改一个贫困户信息
     * @param povertyPeopleVO
     */
    void updatePovertyUser(PovertyPeopleVO povertyPeopleVO);

    /**
     * 分页查询数据
     * @param povertyPeopleVO
     * @param page
     */
    Page<PovertyPeopleVO> selectPovertyUserPage(PovertyPeopleVO povertyPeopleVO, Page page);

    /**
     * 查询贫困户图片详细信息
     * @param povertyPeopleVO
     * @return
     */
    PovertyPeoplePO povertyInfoImgs(PovertyPeopleVO povertyPeopleVO);

    int verifPovertyUser(PovertyPeopleVO povertyPeopleVO);

    void deleteById(PovertyPeopleVO povertyPeopleVO);
}
