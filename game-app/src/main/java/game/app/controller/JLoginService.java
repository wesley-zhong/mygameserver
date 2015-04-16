package game.app.controller;

import javax.inject.Inject;

import game.app.DO.User;
import game.app.cb.dao.UserCbDAO;
import game.app.domain.Do.UserCbDO;
import game.framework.dao.couchbase.IUpdateDO;
import game.framework.dao.exception.DAOException;
import game.framework.dao.exception.KeyNotFoundException;

import game.framework.service.JIService;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
/**
 * 
* @ClassName: JLoginService
* @Description all service process the json proto should implement JIService
* @author wesly  wiqi.zhong@gmail.com
 */

@Component
public class JLoginService  implements JIService {
	@Inject
	private UserCbDAO  userCbDAO;
	public User  login(User user) throws JsonProcessingException
	{
//		user.setUserName(user.getUserName()+" ok");
//		
//		UserCbDO  userDo = new UserCbDO();
//		userDo.setUserName(user.getUserName());
//		userDo.setId(user.getId());
//		userCbDAO.create(userDo);
//		userCbDAO.create(userDo);
//		
//		userCbDAO.put(userDo);
		System.out.println("============  put cb   age = "+user.getAge());
		
		for(int i = 0 ; i < 2; i++){
			UserCbDO  cbUserDo = this.userCbDAO.findById(user.getId());
			userCbDAO.put(cbUserDo);
			userCbDAO.put(cbUserDo);
			System.out.println("--------------  "+cbUserDo.getUserName() + "cas = "+cbUserDo.getCas());
		}
		
	//	UserCbDO  cbUserDo = this.userCbDAO.findById(user.getId());
//		IUpdateDO<Integer,UserCbDO> updateDo = new IUpdateDO<Integer,UserCbDO>(){
//			@Override
//			
//			public UserCbDO applyDelta( Integer delta, UserCbDO objectToPersist ){
//				objectToPersist.getItemIds().add(delta);
//				return objectToPersist;
//			}	
//		};
//		
		//cbUserDo.getItemIds().add(user.getAge());
//		try {
//			userCbDAO.safeUpdate(updateDo, user.getAge(), user.getId());
//		} catch (KeyNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (DAOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		return user;
	}
	

}
