package com.Assignment4;

import java.util.List;

public class ShipmentBOSI {
	private String shipmentId;
	private ContactBOSI contactBO;
	private List<ItemBOSI> itemBOs;
	private List<AddressBOSI> addressBOs;
	private String shipmentStatus;
	
	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public ContactBOSI getContactBO() {
		return contactBO;
	}

	public void setContactBO(ContactBOSI contactBO) {
		this.contactBO = contactBO;
	}

	public List<ItemBOSI> getItemBOs() {
		return itemBOs;
	}

	public void setItemBOs(List<ItemBOSI> itemBOs) {
		this.itemBOs = itemBOs;
	}

	public List<AddressBOSI> getAddressBOs() {
		return addressBOs;
	}

	public void setAddressBOs(List<AddressBOSI> addressBOs) {
		this.addressBOs = addressBOs;
	}

	public String getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public void displayInfo()
	{
		System.out.println("ShipmentId:"+shipmentId+"\t"+"shipmentstatus:"+shipmentStatus);
		//contactBO.displaycontact();
		for(ItemBOSI item:itemBOs)
		{
			System.out.println("Items list:"+item);
		}
		for(AddressBOSI address:addressBOs)
		{
			System.out.println("Address:"+address);
		}
	}
}

