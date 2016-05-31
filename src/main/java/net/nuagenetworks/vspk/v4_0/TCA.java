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
import net.nuagenetworks.vspk.v4_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "tca", resourceName = "tcas")
public class TCA extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum Scope { GLOBAL, LOCAL };
   public enum Metric { BYTES_IN, BYTES_OUT, EGRESS_BYTE_COUNT, EGRESS_PACKET_COUNT, INGRESS_BYTE_COUNT, INGRESS_PACKET_COUNT, PACKETS_DROPPED_BY_RATE_LIMIT, PACKETS_IN, PACKETS_IN_DROPPED, PACKETS_IN_ERROR, PACKETS_OUT, PACKETS_OUT_DROPPED, PACKETS_OUT_ERROR };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Type { BREACH, ROLLING_AVERAGE };

   
   @JsonProperty(value = "URLEndPoint")
   protected String URLEndPoint;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "scope")
   protected Scope scope;
   
   @JsonProperty(value = "period")
   protected Long period;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "metric")
   protected Metric metric;
   
   @JsonProperty(value = "threshold")
   protected Long threshold;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "type")
   protected Type type;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public TCA() {
      scope = Scope.LOCAL;
      metric = Metric.BYTES_IN;
      type = Type.ROLLING_AVERAGE;
      
      metadatas = new MetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   public String getURLEndPoint() {
      return URLEndPoint;
   }

   public void setURLEndPoint(String value) { 
      this.URLEndPoint = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public Scope getScope() {
      return scope;
   }

   public void setScope(Scope value) { 
      this.scope = value;
   }
   public Long getPeriod() {
      return period;
   }

   public void setPeriod(Long value) { 
      this.period = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public Metric getMetric() {
      return metric;
   }

   public void setMetric(Metric value) { 
      this.metric = value;
   }
   public Long getThreshold() {
      return threshold;
   }

   public void setThreshold(Long value) { 
      this.threshold = value;
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
   public Type getType() {
      return type;
   }

   public void setType(Type value) { 
      this.type = value;
   }
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "TCA [" + "URLEndPoint=" + URLEndPoint + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", scope=" + scope + ", period=" + period + ", description=" + description + ", metric=" + metric + ", threshold=" + threshold + ", entityScope=" + entityScope + ", externalID=" + externalID + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}