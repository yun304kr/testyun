package egovframework.test;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("bookDAO")
public class BookDAO extends EgovComAbstractDAO {
	
	public void insertBook(BookVO vo) {
		insert("bookDAO.insertBook", vo);
	}
	
	public List<BookVO> selectBook(BookVO vo) {
		// TODO Auto-generated method stub
		return (List<BookVO>) list("bookDAO.selectBook", vo);
	}
	
	
}
