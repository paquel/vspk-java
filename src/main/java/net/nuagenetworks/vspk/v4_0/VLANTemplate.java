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
import net.nuagenetworks.vspk.v4_0.fetchers.UplinkConnectionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.BRConnectionsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vlantemplate", resourceName = "vlantemplates")
public class VLANTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "value")
   protected Long value;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "associatedEgressQOSPolicyID")
   protected String associatedEgressQOSPolicyID;
   
   @JsonProperty(value = "associatedVSCProfileID")
   protected String associatedVSCProfileID;
   
   @JsonProperty(value = "ducVlan")
   protected Boolean ducVlan;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private UplinkConnectionsFetcher uplinkConnections;
   
   @JsonIgnore
   private BRConnectionsFetcher bRConnections;
   

   public VLANTemplate() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      uplinkConnections = new UplinkConnectionsFetcher(this);
      
      bRConnections = new BRConnectionsFetcher(this);
      
   }

   @JsonIgnore
   public Long getValue() {
      return value;
   }

   @JsonIgnore
   public void setValue(Long value) { 
      this.value = value;
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
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
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
   public String getAssociatedEgressQOSPolicyID() {
      return associatedEgressQOSPolicyID;
   }

   @JsonIgnore
   public void setAssociatedEgressQOSPolicyID(String value) { 
      this.associatedEgressQOSPolicyID = value;
   }
   @JsonIgnore
   public String getAssociatedVSCProfileID() {
      return associatedVSCProfileID;
   }

   @JsonIgnore
   public void setAssociatedVSCProfileID(String value) { 
      this.associatedVSCProfileID = value;
   }
   @JsonIgnore
   public Boolean getDucVlan() {
      return ducVlan;
   }

   @JsonIgnore
   public void setDucVlan(Boolean value) { 
      this.ducVlan = value;
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
   
   @JsonIgnore
   public UplinkConnectionsFetcher getUplinkConnections() {
      return uplinkConnections;
   }
   
   @JsonIgnore
   public BRConnectionsFetcher getBRConnections() {
      return bRConnections;
   }
   

   public String toString() {
      return "VLANTemplate [" + "value=" + value + ", lastUpdatedBy=" + lastUpdatedBy + ", description=" + description + ", entityScope=" + entityScope + ", associatedEgressQOSPolicyID=" + associatedEgressQOSPolicyID + ", associatedVSCProfileID=" + associatedVSCProfileID + ", ducVlan=" + ducVlan + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}