package backend;

public class Position {
	private int positionId;
	private String positionName;
	
	public Position() {
		this.positionId = 0;
        this.positionName = "Default Position"; 
    }

    public Position(String positionName) {
        this.positionName = positionName;
    }

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
   
}
