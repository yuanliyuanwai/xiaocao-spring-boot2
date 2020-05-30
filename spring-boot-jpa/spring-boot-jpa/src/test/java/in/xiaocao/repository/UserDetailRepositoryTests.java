package in.xiaocao.repository;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.xiaocao.model.Address;
import in.xiaocao.model.UserDetail;
import in.xiaocao.model.UserInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDetailRepositoryTests {

	@Resource
	private AddressRepository addressRepository;
	@Resource
	private UserDetailRepository userDetailRepository;

	@Test
	public void testSaveAddress() {
		Address address=new Address();
		address.setUserId(1L);
		address.setCity("北京");
		address.setProvince("北京");
		address.setStreet("分钟寺");
		addressRepository.save(address);
	}

	@Test
	public void testSaveUserDetail() {
		UserDetail userDetail=new UserDetail();
		userDetail.setUserId(3L);
		userDetail.setHobby("吃鸡游戏");
		userDetail.setAge(28);
		userDetail.setIntroduction("一个爱玩的人");
		userDetailRepository.save(userDetail);
	}

	@Test
	public void testUserInfo()  {
		List<UserInfo> userInfos=userDetailRepository.findUserInfo("钓鱼");
		for (UserInfo userInfo:userInfos){
			System.out.println("userInfo: "+userInfo.getUserName()+"-"+userInfo.getEmail()+"-"+userInfo.getHobby()+"-"+userInfo.getIntroduction());
		}
	}
}