/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package net.nuagenetworks.vspk.v4_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "bootstrap", resourceName = "bootstraps")
public class Bootstrap extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum ZFBMatchAttribute { NONE, MAC_ADDRESS, IP_ADDRESS, HOSTNAME, NSGATEWAY_ID, SERIAL_NUMBER };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Status { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT };

   
   @JsonProperty(value = "ZFBInfo")
   protected String ZFBInfo;
   
   @JsonProperty(value = "ZFBMatchAttribute")
   protected ZFBMatchAttribute ZFBMatchAttribute;
   
   @JsonProperty(value = "ZFBMatchValue")
   protected String ZFBMatchValue;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "installerID")
   protected String installerID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public Bootstrap() {
      status = Status.INACTIVE;
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   @JsonIgnore
   public String getZFBInfo() {
      return ZFBInfo;
   }

   @JsonIgnore
   public void setZFBInfo(String value) { 
      this.ZFBInfo = value;
   }
   @JsonIgnore
   public ZFBMatchAttribute getZFBMatchAttribute() {
      return ZFBMatchAttribute;
   }

   @JsonIgnore
   public void setZFBMatchAttribute(ZFBMatchAttribute value) { 
      this.ZFBMatchAttribute = value;
   }
   @JsonIgnore
   public String getZFBMatchValue() {
      return ZFBMatchValue;
   }

   @JsonIgnore
   public void setZFBMatchValue(String value) { 
      this.ZFBMatchValue = value;
   }
   @JsonIgnore
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   @JsonIgnore
   public String getInstallerID() {
      return installerID;
   }

   @JsonIgnore
   public void setInstallerID(String value) { 
      this.installerID = value;
   }
   @JsonIgnore
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   @JsonIgnore
   public Status getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(Status value) { 
      this.status = value;
   }
   @JsonIgnore
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "Bootstrap [" + "ZFBInfo=" + ZFBInfo + ", ZFBMatchAttribute=" + ZFBMatchAttribute + ", ZFBMatchValue=" + ZFBMatchValue + ", lastUpdatedBy=" + lastUpdatedBy + ", installerID=" + installerID + ", entityScope=" + entityScope + ", status=" + status + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}