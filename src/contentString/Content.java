package contentString;

public class Content {
	
	private String location = "";
	private String info = "";
	private String content = "";
	
	public Content(String location, String info)
	{
		this.location = location;
		this.info = info;
	}
	
	public Content(String location)
	{
		this.location = location;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String getInfo()
	{
		return info;
	}
}
