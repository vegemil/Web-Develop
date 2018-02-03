package org.zerock.domain;

import java.sql.Timestamp;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //Getter, Setter 한번에 정리하도
@AllArgsConstructor
public class MemberVO {
	
	private int mno;
	private String mid;
	private String mpw;
	private String mname;
	private Timestamp regdate;
}
