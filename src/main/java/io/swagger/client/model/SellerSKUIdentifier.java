/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SellerSKUIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-07T12:37:02.299+09:00")
public class SellerSKUIdentifier {
  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("SellerId")
  private String sellerId = null;

  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  public SellerSKUIdentifier marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * A marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "A marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public SellerSKUIdentifier sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The seller identifier submitted for the operation.
   * @return sellerId
  **/
  @ApiModelProperty(required = true, value = "The seller identifier submitted for the operation.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public SellerSKUIdentifier sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller stock keeping unit (SKU) of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(required = true, value = "The seller stock keeping unit (SKU) of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerSKUIdentifier sellerSKUIdentifier = (SellerSKUIdentifier) o;
    return Objects.equals(this.marketplaceId, sellerSKUIdentifier.marketplaceId) &&
        Objects.equals(this.sellerId, sellerSKUIdentifier.sellerId) &&
        Objects.equals(this.sellerSKU, sellerSKUIdentifier.sellerSKU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, sellerId, sellerSKU);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerSKUIdentifier {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
