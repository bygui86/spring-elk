package com.rabbit.samples.elk.services;

import com.rabbit.samples.elk.domain.UserInfo;
import com.rabbit.samples.elk.repos.UserInfoRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * @author Matteo Baiguini
 * matteo@solidarchitectures.com
 * 24 Mar 2019
 */
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter(AccessLevel.PROTECTED)
@Service
public class UserInfoService {

	UserInfoRepo userInfoRepo;

	public List<UserInfo> getAllUserInfo() {

		log.info("Get all UserInfo");

		return getUserInfoRepo().findAll();
	}

	public Optional<UserInfo> getUserInfoById(final Long id) {

		log.info("Get UserInfo by id {}", id);

		return getUserInfoRepo().findById(id);
	}

}
