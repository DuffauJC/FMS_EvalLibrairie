package fr.fms.entities;

public class Thematic {

	private int idThematic;
	private String name;
	private String description;
	/**
	 * 
	 * @param idCategory
	 * @param catName
	 * @param description
	 */
	public Thematic(int idThematic, String name, String description) {
		
		setIdThematic(idThematic);
		setName(name);
		setDescription(description);
		
	}
	/**
	 * 
	 * @param catName
	 * @param description
	 */
	public Thematic( String name, String description) {
		
		setName(name);
		setDescription(description);
		
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the idThematic
	 */
	public int getIdThematic() {
		return idThematic;
	}
	/**
	 * @param idThematic the idThematic to set
	 */
	public void setIdThematic(int idThematic) {
		this.idThematic = idThematic;
	}
	@Override
	public String toString() {
		return "Thematic [idThematic=" + idThematic + ", name=" + name + ", description=" + description + "]";
	}



}
