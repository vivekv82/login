package skilltracker.fse.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;
import org.springframework.data.annotation.Id;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginUser implements Serializable {

	private static final long serialVersionUID = -6992178023483780074L;

	@NotNull
	@Size(min = 8, max = 30)
	@Id
	private String userid;
	
	@NotNull
	@Size(min = 8, max = 30)
	private String password;

	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String toString() {
		return this.userid;
	}

}
