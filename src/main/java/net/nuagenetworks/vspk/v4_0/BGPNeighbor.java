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
@RestEntity(restName = "bgpneighbor", resourceName = "bgpneighbors")
public class BGPNeighbor extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "dampeningEnabled")
   protected Boolean dampeningEnabled;
   
   @JsonProperty(value = "peerAS")
   protected Long peerAS;
   
   @JsonProperty(value = "peerIP")
   protected String peerIP;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "session")
   protected String session;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "associatedExportRoutingPolicyID")
   protected String associatedExportRoutingPolicyID;
   
   @JsonProperty(value = "associatedImportRoutingPolicyID")
   protected String associatedImportRoutingPolicyID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public BGPNeighbor() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   @JsonIgnore
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   @JsonIgnore
   public Boolean getDampeningEnabled() {
      return dampeningEnabled;
   }

   @JsonIgnore
   public void setDampeningEnabled(Boolean value) { 
      this.dampeningEnabled = value;
   }
   @JsonIgnore
   public Long getPeerAS() {
      return peerAS;
   }

   @JsonIgnore
   public void setPeerAS(Long value) { 
      this.peerAS = value;
   }
   @JsonIgnore
   public String getPeerIP() {
      return peerIP;
   }

   @JsonIgnore
   public void setPeerIP(String value) { 
      this.peerIP = value;
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
   public String getSession() {
      return session;
   }

   @JsonIgnore
   public void setSession(String value) { 
      this.session = value;
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
   public String getAssociatedExportRoutingPolicyID() {
      return associatedExportRoutingPolicyID;
   }

   @JsonIgnore
   public void setAssociatedExportRoutingPolicyID(String value) { 
      this.associatedExportRoutingPolicyID = value;
   }
   @JsonIgnore
   public String getAssociatedImportRoutingPolicyID() {
      return associatedImportRoutingPolicyID;
   }

   @JsonIgnore
   public void setAssociatedImportRoutingPolicyID(String value) { 
      this.associatedImportRoutingPolicyID = value;
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
      return "BGPNeighbor [" + "name=" + name + ", dampeningEnabled=" + dampeningEnabled + ", peerAS=" + peerAS + ", peerIP=" + peerIP + ", description=" + description + ", session=" + session + ", entityScope=" + entityScope + ", associatedExportRoutingPolicyID=" + associatedExportRoutingPolicyID + ", associatedImportRoutingPolicyID=" + associatedImportRoutingPolicyID + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}