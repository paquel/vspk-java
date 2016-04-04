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


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EgressQOSPolicy extends RestObject {

   public final static String REST_NAME = "egressqospolicy";
   public final static String RESOURCE_NAME = "egressqospolicies";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "assocEgressQosId")
   protected String assocEgressQosId;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "parentQueueAssociatedRateLimiterID")
   protected String parentQueueAssociatedRateLimiterID;
   
   @JsonProperty(value = "queue1AssociatedRateLimiterID")
   protected String queue1AssociatedRateLimiterID;
   
   @JsonProperty(value = "queue1ForwardingClasses")
   protected java.util.List<String> queue1ForwardingClasses;
   
   @JsonProperty(value = "queue2AssociatedRateLimiterID")
   protected String queue2AssociatedRateLimiterID;
   
   @JsonProperty(value = "queue2ForwardingClasses")
   protected java.util.List<String> queue2ForwardingClasses;
   
   @JsonProperty(value = "queue3AssociatedRateLimiterID")
   protected String queue3AssociatedRateLimiterID;
   
   @JsonProperty(value = "queue3ForwardingClasses")
   protected java.util.List<String> queue3ForwardingClasses;
   
   @JsonProperty(value = "queue4AssociatedRateLimiterID")
   protected String queue4AssociatedRateLimiterID;
   
   @JsonProperty(value = "queue4ForwardingClasses")
   protected java.util.List<String> queue4ForwardingClasses;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public EgressQOSPolicy() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public String getAssocEgressQosId() {
      return assocEgressQosId;
   }

   public void setAssocEgressQosId(String value) { 
      this.assocEgressQosId = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getParentQueueAssociatedRateLimiterID() {
      return parentQueueAssociatedRateLimiterID;
   }

   public void setParentQueueAssociatedRateLimiterID(String value) { 
      this.parentQueueAssociatedRateLimiterID = value;
   }
   public String getQueue1AssociatedRateLimiterID() {
      return queue1AssociatedRateLimiterID;
   }

   public void setQueue1AssociatedRateLimiterID(String value) { 
      this.queue1AssociatedRateLimiterID = value;
   }
   public java.util.List<String> getQueue1ForwardingClasses() {
      return queue1ForwardingClasses;
   }

   public void setQueue1ForwardingClasses(java.util.List<String> value) { 
      this.queue1ForwardingClasses = value;
   }
   public String getQueue2AssociatedRateLimiterID() {
      return queue2AssociatedRateLimiterID;
   }

   public void setQueue2AssociatedRateLimiterID(String value) { 
      this.queue2AssociatedRateLimiterID = value;
   }
   public java.util.List<String> getQueue2ForwardingClasses() {
      return queue2ForwardingClasses;
   }

   public void setQueue2ForwardingClasses(java.util.List<String> value) { 
      this.queue2ForwardingClasses = value;
   }
   public String getQueue3AssociatedRateLimiterID() {
      return queue3AssociatedRateLimiterID;
   }

   public void setQueue3AssociatedRateLimiterID(String value) { 
      this.queue3AssociatedRateLimiterID = value;
   }
   public java.util.List<String> getQueue3ForwardingClasses() {
      return queue3ForwardingClasses;
   }

   public void setQueue3ForwardingClasses(java.util.List<String> value) { 
      this.queue3ForwardingClasses = value;
   }
   public String getQueue4AssociatedRateLimiterID() {
      return queue4AssociatedRateLimiterID;
   }

   public void setQueue4AssociatedRateLimiterID(String value) { 
      this.queue4AssociatedRateLimiterID = value;
   }
   public java.util.List<String> getQueue4ForwardingClasses() {
      return queue4ForwardingClasses;
   }

   public void setQueue4ForwardingClasses(java.util.List<String> value) { 
      this.queue4ForwardingClasses = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "EgressQOSPolicy [" + "assocEgressQosId=" + assocEgressQosId + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", parentQueueAssociatedRateLimiterID=" + parentQueueAssociatedRateLimiterID + ", queue1AssociatedRateLimiterID=" + queue1AssociatedRateLimiterID + ", queue1ForwardingClasses=" + queue1ForwardingClasses + ", queue2AssociatedRateLimiterID=" + queue2AssociatedRateLimiterID + ", queue2ForwardingClasses=" + queue2ForwardingClasses + ", queue3AssociatedRateLimiterID=" + queue3AssociatedRateLimiterID + ", queue3ForwardingClasses=" + queue3ForwardingClasses + ", queue4AssociatedRateLimiterID=" + queue4AssociatedRateLimiterID + ", queue4ForwardingClasses=" + queue4ForwardingClasses + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}