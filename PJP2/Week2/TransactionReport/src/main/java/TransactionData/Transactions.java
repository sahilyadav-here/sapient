package TransactionData;

public class Transactions {
	
	private String eId;
	private String cId;
	private String sId;
	private String tType;
	private String tDate;
	float value;
	boolean flag;
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public String gettDate() {
		return tDate;
	}
	public void settDate(String tDate) {
		this.tDate = tDate;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Transactions(String eId, String cId, String sId, String tType, String tDate, float value, boolean flag) {
		super();
		this.eId = eId;
		this.cId = cId;
		this.sId = sId;
		this.tType = tType;
		this.tDate = tDate;
		this.value = value;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Transactions [eId=" + eId + ", cId=" + cId + ", sId=" + sId + ", tType=" + tType + ", tDate=" + tDate
				+ ", value=" + value + ", flag=" + flag + "]";
	}
	
}
