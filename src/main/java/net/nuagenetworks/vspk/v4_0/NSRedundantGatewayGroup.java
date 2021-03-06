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
import net.nuagenetworks.vspk.v4_0.fetchers.NSGatewaysFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.RedundantPortsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgredundancygroup", resourceName = "nsgredundancygroups")
public class NSRedundantGatewayGroup extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum RedundantGatewayStatus { FAILED, SUCCESS };
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Personality { DC7X50, HARDWARE_VTEP, NSG, OTHER, VRSG, VSA, VSG };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "gatewayPeer1AutodiscoveredGatewayID")
   protected String gatewayPeer1AutodiscoveredGatewayID;
   
   @JsonProperty(value = "gatewayPeer1ID")
   protected String gatewayPeer1ID;
   
   @JsonProperty(value = "gatewayPeer1Name")
   protected String gatewayPeer1Name;
   
   @JsonProperty(value = "gatewayPeer2AutodiscoveredGatewayID")
   protected String gatewayPeer2AutodiscoveredGatewayID;
   
   @JsonProperty(value = "gatewayPeer2ID")
   protected String gatewayPeer2ID;
   
   @JsonProperty(value = "gatewayPeer2Name")
   protected String gatewayPeer2Name;
   
   @JsonProperty(value = "heartbeatInterval")
   protected Long heartbeatInterval;
   
   @JsonProperty(value = "heartbeatVLANID")
   protected Long heartbeatVLANID;
   
   @JsonProperty(value = "redundancyPortIDs")
   protected java.util.List<String> redundancyPortIDs;
   
   @JsonProperty(value = "redundantGatewayStatus")
   protected RedundantGatewayStatus redundantGatewayStatus;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "consecutiveFailuresCount")
   protected Long consecutiveFailuresCount;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private NSGatewaysFetcher nSGateways;
   
   @JsonIgnore
   private RedundantPortsFetcher redundantPorts;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public NSRedundantGatewayGroup() {
      
      metadatas = new MetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      nSGateways = new NSGatewaysFetcher(this);
      
      redundantPorts = new RedundantPortsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   @JsonIgnore
   public String getGatewayPeer1AutodiscoveredGatewayID() {
      return gatewayPeer1AutodiscoveredGatewayID;
   }

   @JsonIgnore
   public void setGatewayPeer1AutodiscoveredGatewayID(String value) { 
      this.gatewayPeer1AutodiscoveredGatewayID = value;
   }
   @JsonIgnore
   public String getGatewayPeer1ID() {
      return gatewayPeer1ID;
   }

   @JsonIgnore
   public void setGatewayPeer1ID(String value) { 
      this.gatewayPeer1ID = value;
   }
   @JsonIgnore
   public String getGatewayPeer1Name() {
      return gatewayPeer1Name;
   }

   @JsonIgnore
   public void setGatewayPeer1Name(String value) { 
      this.gatewayPeer1Name = value;
   }
   @JsonIgnore
   public String getGatewayPeer2AutodiscoveredGatewayID() {
      return gatewayPeer2AutodiscoveredGatewayID;
   }

   @JsonIgnore
   public void setGatewayPeer2AutodiscoveredGatewayID(String value) { 
      this.gatewayPeer2AutodiscoveredGatewayID = value;
   }
   @JsonIgnore
   public String getGatewayPeer2ID() {
      return gatewayPeer2ID;
   }

   @JsonIgnore
   public void setGatewayPeer2ID(String value) { 
      this.gatewayPeer2ID = value;
   }
   @JsonIgnore
   public String getGatewayPeer2Name() {
      return gatewayPeer2Name;
   }

   @JsonIgnore
   public void setGatewayPeer2Name(String value) { 
      this.gatewayPeer2Name = value;
   }
   @JsonIgnore
   public Long getHeartbeatInterval() {
      return heartbeatInterval;
   }

   @JsonIgnore
   public void setHeartbeatInterval(Long value) { 
      this.heartbeatInterval = value;
   }
   @JsonIgnore
   public Long getHeartbeatVLANID() {
      return heartbeatVLANID;
   }

   @JsonIgnore
   public void setHeartbeatVLANID(Long value) { 
      this.heartbeatVLANID = value;
   }
   @JsonIgnore
   public java.util.List<String> getRedundancyPortIDs() {
      return redundancyPortIDs;
   }

   @JsonIgnore
   public void setRedundancyPortIDs(java.util.List<String> value) { 
      this.redundancyPortIDs = value;
   }
   @JsonIgnore
   public RedundantGatewayStatus getRedundantGatewayStatus() {
      return redundantGatewayStatus;
   }

   @JsonIgnore
   public void setRedundantGatewayStatus(RedundantGatewayStatus value) { 
      this.redundantGatewayStatus = value;
   }
   @JsonIgnore
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   @JsonIgnore
   public Personality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(Personality value) { 
      this.personality = value;
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
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
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
   public Long getConsecutiveFailuresCount() {
      return consecutiveFailuresCount;
   }

   @JsonIgnore
   public void setConsecutiveFailuresCount(Long value) { 
      this.consecutiveFailuresCount = value;
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
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public NSGatewaysFetcher getNSGateways() {
      return nSGateways;
   }
   
   @JsonIgnore
   public RedundantPortsFetcher getRedundantPorts() {
      return redundantPorts;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "NSRedundantGatewayGroup [" + "name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", gatewayPeer1AutodiscoveredGatewayID=" + gatewayPeer1AutodiscoveredGatewayID + ", gatewayPeer1ID=" + gatewayPeer1ID + ", gatewayPeer1Name=" + gatewayPeer1Name + ", gatewayPeer2AutodiscoveredGatewayID=" + gatewayPeer2AutodiscoveredGatewayID + ", gatewayPeer2ID=" + gatewayPeer2ID + ", gatewayPeer2Name=" + gatewayPeer2Name + ", heartbeatInterval=" + heartbeatInterval + ", heartbeatVLANID=" + heartbeatVLANID + ", redundancyPortIDs=" + redundancyPortIDs + ", redundantGatewayStatus=" + redundantGatewayStatus + ", permittedAction=" + permittedAction + ", personality=" + personality + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", consecutiveFailuresCount=" + consecutiveFailuresCount + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}