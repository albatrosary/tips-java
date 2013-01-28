package org.albatrosary;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.albatrosary.data.mapper.RVTBKXMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String resource = "org/albatrosary/data/mybatis-config.xml";
		SqlSessionFactory sqlSessionFactory = null;
		try {
			// mybatis�ݒ�t�@�C���̓ǂݍ���
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// SqlSessionFactory ���� SqlSession ���擾����
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//		  Blog blog = (Blog) session.selectOne("org.albatrosary.BlogMapper.selectBlog", 101);
//		} finally {
//		  session.close();
//		}
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			RVTBKXMapper mapper = session.getMapper(RVTBKXMapper.class);
			List<RVTBKX> rvtbkx = mapper.selectRVTBKX("����");
			
			for(RVTBKX v:rvtbkx) {
				System.out.println(v.getRvkx_sei_nk());
			}
		} finally {
			session.close();
		}
		
	}

}
