package de.omikron.services;

import java.util.List;

import de.omikron.api.Campaign;

/**
 * The response from a ProductCampaign.ff service.
 * 
 * @author arno.pitters
 *
 */
public class ProductCampaignResponse extends FFResponse {

	private List<Campaign> campaigns;

	public ProductCampaignResponse() {
	}

	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

	@Override
	public String toString() {
		return "ProductCampaignResponse [campaigns=" + campaigns + "]";
	}

}
