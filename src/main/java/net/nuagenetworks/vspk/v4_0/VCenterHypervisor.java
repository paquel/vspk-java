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
import net.nuagenetworks.vspk.v4_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VRSAddressRangesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VRSMetricsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VRSRedeploymentpoliciesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vcenterhypervisor", resourceName = "vcenterhypervisors")
public class VCenterHypervisor extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum VRSState { DEPLOYED, DEPLOYING, NOT_DEPLOYED, TIMEDOUT, UPGRADING };
   public enum DestinationMirrorPort { ens160, ens161, ens224, ens256, no_mirror };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "vCenterIP")
   protected String vCenterIP;
   
   @JsonProperty(value = "vCenterPassword")
   protected String vCenterPassword;
   
   @JsonProperty(value = "vCenterUser")
   protected String vCenterUser;
   
   @JsonProperty(value = "VRSConfigurationTimeLimit")
   protected Long VRSConfigurationTimeLimit;
   
   @JsonProperty(value = "VRSMetricsID")
   protected String VRSMetricsID;
   
   @JsonProperty(value = "VRSState")
   protected VRSState VRSState;
   
   @JsonProperty(value = "vRequireNuageMetadata")
   protected Boolean vRequireNuageMetadata;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "managedObjectID")
   protected String managedObjectID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "lastVRSDeployedDate")
   protected Float lastVRSDeployedDate;
   
   @JsonProperty(value = "dataDNS1")
   protected String dataDNS1;
   
   @JsonProperty(value = "dataDNS2")
   protected String dataDNS2;
   
   @JsonProperty(value = "dataGateway")
   protected String dataGateway;
   
   @JsonProperty(value = "dataIPAddress")
   protected String dataIPAddress;
   
   @JsonProperty(value = "dataNetmask")
   protected String dataNetmask;
   
   @JsonProperty(value = "dataNetworkPortgroup")
   protected String dataNetworkPortgroup;
   
   @JsonProperty(value = "datapathSyncTimeout")
   protected Long datapathSyncTimeout;
   
   @JsonProperty(value = "scope")
   protected Boolean scope;
   
   @JsonProperty(value = "secondaryNuageController")
   protected String secondaryNuageController;
   
   @JsonProperty(value = "removedFromVCenterInventory")
   protected Boolean removedFromVCenterInventory;
   
   @JsonProperty(value = "genericSplitActivation")
   protected Boolean genericSplitActivation;
   
   @JsonProperty(value = "separateDataNetwork")
   protected Boolean separateDataNetwork;
   
   @JsonProperty(value = "deploymentCount")
   protected Long deploymentCount;
   
   @JsonProperty(value = "personality")
   protected String personality;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "destinationMirrorPort")
   protected DestinationMirrorPort destinationMirrorPort;
   
   @JsonProperty(value = "metadataServerIP")
   protected String metadataServerIP;
   
   @JsonProperty(value = "metadataServerListenPort")
   protected Long metadataServerListenPort;
   
   @JsonProperty(value = "metadataServerPort")
   protected Long metadataServerPort;
   
   @JsonProperty(value = "metadataServiceEnabled")
   protected Boolean metadataServiceEnabled;
   
   @JsonProperty(value = "networkUplinkInterface")
   protected String networkUplinkInterface;
   
   @JsonProperty(value = "networkUplinkInterfaceGateway")
   protected String networkUplinkInterfaceGateway;
   
   @JsonProperty(value = "networkUplinkInterfaceIp")
   protected String networkUplinkInterfaceIp;
   
   @JsonProperty(value = "networkUplinkInterfaceNetmask")
   protected String networkUplinkInterfaceNetmask;
   
   @JsonProperty(value = "nfsLogServer")
   protected String nfsLogServer;
   
   @JsonProperty(value = "nfsMountPath")
   protected String nfsMountPath;
   
   @JsonProperty(value = "mgmtDNS1")
   protected String mgmtDNS1;
   
   @JsonProperty(value = "mgmtDNS2")
   protected String mgmtDNS2;
   
   @JsonProperty(value = "mgmtGateway")
   protected String mgmtGateway;
   
   @JsonProperty(value = "mgmtIPAddress")
   protected String mgmtIPAddress;
   
   @JsonProperty(value = "mgmtNetmask")
   protected String mgmtNetmask;
   
   @JsonProperty(value = "mgmtNetworkPortgroup")
   protected String mgmtNetworkPortgroup;
   
   @JsonProperty(value = "dhcpRelayServer")
   protected String dhcpRelayServer;
   
   @JsonProperty(value = "mirrorNetworkPortgroup")
   protected String mirrorNetworkPortgroup;
   
   @JsonProperty(value = "siteId")
   protected String siteId;
   
   @JsonProperty(value = "allowDataDHCP")
   protected Boolean allowDataDHCP;
   
   @JsonProperty(value = "allowMgmtDHCP")
   protected Boolean allowMgmtDHCP;
   
   @JsonProperty(value = "flowEvictionThreshold")
   protected Long flowEvictionThreshold;
   
   @JsonProperty(value = "vmNetworkPortgroup")
   protected String vmNetworkPortgroup;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "toolboxDeploymentMode")
   protected Boolean toolboxDeploymentMode;
   
   @JsonProperty(value = "toolboxGroup")
   protected String toolboxGroup;
   
   @JsonProperty(value = "toolboxIP")
   protected String toolboxIP;
   
   @JsonProperty(value = "toolboxPassword")
   protected String toolboxPassword;
   
   @JsonProperty(value = "toolboxUserName")
   protected String toolboxUserName;
   
   @JsonProperty(value = "portgroupMetadata")
   protected Boolean portgroupMetadata;
   
   @JsonProperty(value = "novaClientVersion")
   protected Long novaClientVersion;
   
   @JsonProperty(value = "novaMetadataServiceAuthUrl")
   protected String novaMetadataServiceAuthUrl;
   
   @JsonProperty(value = "novaMetadataServiceEndpoint")
   protected String novaMetadataServiceEndpoint;
   
   @JsonProperty(value = "novaMetadataServicePassword")
   protected String novaMetadataServicePassword;
   
   @JsonProperty(value = "novaMetadataServiceTenant")
   protected String novaMetadataServiceTenant;
   
   @JsonProperty(value = "novaMetadataServiceUsername")
   protected String novaMetadataServiceUsername;
   
   @JsonProperty(value = "novaMetadataSharedSecret")
   protected String novaMetadataSharedSecret;
   
   @JsonProperty(value = "novaRegionName")
   protected String novaRegionName;
   
   @JsonProperty(value = "upgradePackagePassword")
   protected String upgradePackagePassword;
   
   @JsonProperty(value = "upgradePackageURL")
   protected String upgradePackageURL;
   
   @JsonProperty(value = "upgradePackageUsername")
   protected String upgradePackageUsername;
   
   @JsonProperty(value = "upgradeScriptTimeLimit")
   protected Long upgradeScriptTimeLimit;
   
   @JsonProperty(value = "upgradeStatus")
   protected String upgradeStatus;
   
   @JsonProperty(value = "upgradeTimedout")
   protected Boolean upgradeTimedout;
   
   @JsonProperty(value = "primaryNuageController")
   protected String primaryNuageController;
   
   @JsonProperty(value = "vrsId")
   protected String vrsId;
   
   @JsonProperty(value = "vrsPassword")
   protected String vrsPassword;
   
   @JsonProperty(value = "vrsUserName")
   protected String vrsUserName;
   
   @JsonProperty(value = "staticRoute")
   protected String staticRoute;
   
   @JsonProperty(value = "staticRouteGateway")
   protected String staticRouteGateway;
   
   @JsonProperty(value = "staticRouteNetmask")
   protected String staticRouteNetmask;
   
   @JsonProperty(value = "ntpServer1")
   protected String ntpServer1;
   
   @JsonProperty(value = "ntpServer2")
   protected String ntpServer2;
   
   @JsonProperty(value = "mtu")
   protected Long mtu;
   
   @JsonProperty(value = "multiVMSsupport")
   protected Boolean multiVMSsupport;
   
   @JsonProperty(value = "multicastReceiveInterface")
   protected String multicastReceiveInterface;
   
   @JsonProperty(value = "multicastReceiveInterfaceIP")
   protected String multicastReceiveInterfaceIP;
   
   @JsonProperty(value = "multicastReceiveInterfaceNetmask")
   protected String multicastReceiveInterfaceNetmask;
   
   @JsonProperty(value = "multicastReceiveRange")
   protected String multicastReceiveRange;
   
   @JsonProperty(value = "multicastSendInterface")
   protected String multicastSendInterface;
   
   @JsonProperty(value = "multicastSendInterfaceIP")
   protected String multicastSendInterfaceIP;
   
   @JsonProperty(value = "multicastSendInterfaceNetmask")
   protected String multicastSendInterfaceNetmask;
   
   @JsonProperty(value = "multicastSourcePortgroup")
   protected String multicastSourcePortgroup;
   
   @JsonProperty(value = "customizedScriptURL")
   protected String customizedScriptURL;
   
   @JsonProperty(value = "availableNetworks")
   protected java.util.List<String> availableNetworks;
   
   @JsonProperty(value = "ovfURL")
   protected String ovfURL;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "hypervisorIP")
   protected String hypervisorIP;
   
   @JsonProperty(value = "hypervisorPassword")
   protected String hypervisorPassword;
   
   @JsonProperty(value = "hypervisorUser")
   protected String hypervisorUser;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private VRSAddressRangesFetcher vRSAddressRanges;
   
   @JsonIgnore
   private VRSMetricsFetcher vRSMetrics;
   
   @JsonIgnore
   private VRSRedeploymentpoliciesFetcher vRSRedeploymentpolicies;
   

   public VCenterHypervisor() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      vRSAddressRanges = new VRSAddressRangesFetcher(this);
      
      vRSMetrics = new VRSMetricsFetcher(this);
      
      vRSRedeploymentpolicies = new VRSRedeploymentpoliciesFetcher(this);
      
   }

   @JsonIgnore
   public String getVCenterIP() {
      return vCenterIP;
   }

   @JsonIgnore
   public void setVCenterIP(String value) { 
      this.vCenterIP = value;
   }
   @JsonIgnore
   public String getVCenterPassword() {
      return vCenterPassword;
   }

   @JsonIgnore
   public void setVCenterPassword(String value) { 
      this.vCenterPassword = value;
   }
   @JsonIgnore
   public String getVCenterUser() {
      return vCenterUser;
   }

   @JsonIgnore
   public void setVCenterUser(String value) { 
      this.vCenterUser = value;
   }
   @JsonIgnore
   public Long getVRSConfigurationTimeLimit() {
      return VRSConfigurationTimeLimit;
   }

   @JsonIgnore
   public void setVRSConfigurationTimeLimit(Long value) { 
      this.VRSConfigurationTimeLimit = value;
   }
   @JsonIgnore
   public String getVRSMetricsID() {
      return VRSMetricsID;
   }

   @JsonIgnore
   public void setVRSMetricsID(String value) { 
      this.VRSMetricsID = value;
   }
   @JsonIgnore
   public VRSState getVRSState() {
      return VRSState;
   }

   @JsonIgnore
   public void setVRSState(VRSState value) { 
      this.VRSState = value;
   }
   @JsonIgnore
   public Boolean getVRequireNuageMetadata() {
      return vRequireNuageMetadata;
   }

   @JsonIgnore
   public void setVRequireNuageMetadata(Boolean value) { 
      this.vRequireNuageMetadata = value;
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
   public String getManagedObjectID() {
      return managedObjectID;
   }

   @JsonIgnore
   public void setManagedObjectID(String value) { 
      this.managedObjectID = value;
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
   public Float getLastVRSDeployedDate() {
      return lastVRSDeployedDate;
   }

   @JsonIgnore
   public void setLastVRSDeployedDate(Float value) { 
      this.lastVRSDeployedDate = value;
   }
   @JsonIgnore
   public String getDataDNS1() {
      return dataDNS1;
   }

   @JsonIgnore
   public void setDataDNS1(String value) { 
      this.dataDNS1 = value;
   }
   @JsonIgnore
   public String getDataDNS2() {
      return dataDNS2;
   }

   @JsonIgnore
   public void setDataDNS2(String value) { 
      this.dataDNS2 = value;
   }
   @JsonIgnore
   public String getDataGateway() {
      return dataGateway;
   }

   @JsonIgnore
   public void setDataGateway(String value) { 
      this.dataGateway = value;
   }
   @JsonIgnore
   public String getDataIPAddress() {
      return dataIPAddress;
   }

   @JsonIgnore
   public void setDataIPAddress(String value) { 
      this.dataIPAddress = value;
   }
   @JsonIgnore
   public String getDataNetmask() {
      return dataNetmask;
   }

   @JsonIgnore
   public void setDataNetmask(String value) { 
      this.dataNetmask = value;
   }
   @JsonIgnore
   public String getDataNetworkPortgroup() {
      return dataNetworkPortgroup;
   }

   @JsonIgnore
   public void setDataNetworkPortgroup(String value) { 
      this.dataNetworkPortgroup = value;
   }
   @JsonIgnore
   public Long getDatapathSyncTimeout() {
      return datapathSyncTimeout;
   }

   @JsonIgnore
   public void setDatapathSyncTimeout(Long value) { 
      this.datapathSyncTimeout = value;
   }
   @JsonIgnore
   public Boolean getScope() {
      return scope;
   }

   @JsonIgnore
   public void setScope(Boolean value) { 
      this.scope = value;
   }
   @JsonIgnore
   public String getSecondaryNuageController() {
      return secondaryNuageController;
   }

   @JsonIgnore
   public void setSecondaryNuageController(String value) { 
      this.secondaryNuageController = value;
   }
   @JsonIgnore
   public Boolean getRemovedFromVCenterInventory() {
      return removedFromVCenterInventory;
   }

   @JsonIgnore
   public void setRemovedFromVCenterInventory(Boolean value) { 
      this.removedFromVCenterInventory = value;
   }
   @JsonIgnore
   public Boolean getGenericSplitActivation() {
      return genericSplitActivation;
   }

   @JsonIgnore
   public void setGenericSplitActivation(Boolean value) { 
      this.genericSplitActivation = value;
   }
   @JsonIgnore
   public Boolean getSeparateDataNetwork() {
      return separateDataNetwork;
   }

   @JsonIgnore
   public void setSeparateDataNetwork(Boolean value) { 
      this.separateDataNetwork = value;
   }
   @JsonIgnore
   public Long getDeploymentCount() {
      return deploymentCount;
   }

   @JsonIgnore
   public void setDeploymentCount(Long value) { 
      this.deploymentCount = value;
   }
   @JsonIgnore
   public String getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(String value) { 
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
   public DestinationMirrorPort getDestinationMirrorPort() {
      return destinationMirrorPort;
   }

   @JsonIgnore
   public void setDestinationMirrorPort(DestinationMirrorPort value) { 
      this.destinationMirrorPort = value;
   }
   @JsonIgnore
   public String getMetadataServerIP() {
      return metadataServerIP;
   }

   @JsonIgnore
   public void setMetadataServerIP(String value) { 
      this.metadataServerIP = value;
   }
   @JsonIgnore
   public Long getMetadataServerListenPort() {
      return metadataServerListenPort;
   }

   @JsonIgnore
   public void setMetadataServerListenPort(Long value) { 
      this.metadataServerListenPort = value;
   }
   @JsonIgnore
   public Long getMetadataServerPort() {
      return metadataServerPort;
   }

   @JsonIgnore
   public void setMetadataServerPort(Long value) { 
      this.metadataServerPort = value;
   }
   @JsonIgnore
   public Boolean getMetadataServiceEnabled() {
      return metadataServiceEnabled;
   }

   @JsonIgnore
   public void setMetadataServiceEnabled(Boolean value) { 
      this.metadataServiceEnabled = value;
   }
   @JsonIgnore
   public String getNetworkUplinkInterface() {
      return networkUplinkInterface;
   }

   @JsonIgnore
   public void setNetworkUplinkInterface(String value) { 
      this.networkUplinkInterface = value;
   }
   @JsonIgnore
   public String getNetworkUplinkInterfaceGateway() {
      return networkUplinkInterfaceGateway;
   }

   @JsonIgnore
   public void setNetworkUplinkInterfaceGateway(String value) { 
      this.networkUplinkInterfaceGateway = value;
   }
   @JsonIgnore
   public String getNetworkUplinkInterfaceIp() {
      return networkUplinkInterfaceIp;
   }

   @JsonIgnore
   public void setNetworkUplinkInterfaceIp(String value) { 
      this.networkUplinkInterfaceIp = value;
   }
   @JsonIgnore
   public String getNetworkUplinkInterfaceNetmask() {
      return networkUplinkInterfaceNetmask;
   }

   @JsonIgnore
   public void setNetworkUplinkInterfaceNetmask(String value) { 
      this.networkUplinkInterfaceNetmask = value;
   }
   @JsonIgnore
   public String getNfsLogServer() {
      return nfsLogServer;
   }

   @JsonIgnore
   public void setNfsLogServer(String value) { 
      this.nfsLogServer = value;
   }
   @JsonIgnore
   public String getNfsMountPath() {
      return nfsMountPath;
   }

   @JsonIgnore
   public void setNfsMountPath(String value) { 
      this.nfsMountPath = value;
   }
   @JsonIgnore
   public String getMgmtDNS1() {
      return mgmtDNS1;
   }

   @JsonIgnore
   public void setMgmtDNS1(String value) { 
      this.mgmtDNS1 = value;
   }
   @JsonIgnore
   public String getMgmtDNS2() {
      return mgmtDNS2;
   }

   @JsonIgnore
   public void setMgmtDNS2(String value) { 
      this.mgmtDNS2 = value;
   }
   @JsonIgnore
   public String getMgmtGateway() {
      return mgmtGateway;
   }

   @JsonIgnore
   public void setMgmtGateway(String value) { 
      this.mgmtGateway = value;
   }
   @JsonIgnore
   public String getMgmtIPAddress() {
      return mgmtIPAddress;
   }

   @JsonIgnore
   public void setMgmtIPAddress(String value) { 
      this.mgmtIPAddress = value;
   }
   @JsonIgnore
   public String getMgmtNetmask() {
      return mgmtNetmask;
   }

   @JsonIgnore
   public void setMgmtNetmask(String value) { 
      this.mgmtNetmask = value;
   }
   @JsonIgnore
   public String getMgmtNetworkPortgroup() {
      return mgmtNetworkPortgroup;
   }

   @JsonIgnore
   public void setMgmtNetworkPortgroup(String value) { 
      this.mgmtNetworkPortgroup = value;
   }
   @JsonIgnore
   public String getDhcpRelayServer() {
      return dhcpRelayServer;
   }

   @JsonIgnore
   public void setDhcpRelayServer(String value) { 
      this.dhcpRelayServer = value;
   }
   @JsonIgnore
   public String getMirrorNetworkPortgroup() {
      return mirrorNetworkPortgroup;
   }

   @JsonIgnore
   public void setMirrorNetworkPortgroup(String value) { 
      this.mirrorNetworkPortgroup = value;
   }
   @JsonIgnore
   public String getSiteId() {
      return siteId;
   }

   @JsonIgnore
   public void setSiteId(String value) { 
      this.siteId = value;
   }
   @JsonIgnore
   public Boolean getAllowDataDHCP() {
      return allowDataDHCP;
   }

   @JsonIgnore
   public void setAllowDataDHCP(Boolean value) { 
      this.allowDataDHCP = value;
   }
   @JsonIgnore
   public Boolean getAllowMgmtDHCP() {
      return allowMgmtDHCP;
   }

   @JsonIgnore
   public void setAllowMgmtDHCP(Boolean value) { 
      this.allowMgmtDHCP = value;
   }
   @JsonIgnore
   public Long getFlowEvictionThreshold() {
      return flowEvictionThreshold;
   }

   @JsonIgnore
   public void setFlowEvictionThreshold(Long value) { 
      this.flowEvictionThreshold = value;
   }
   @JsonIgnore
   public String getVmNetworkPortgroup() {
      return vmNetworkPortgroup;
   }

   @JsonIgnore
   public void setVmNetworkPortgroup(String value) { 
      this.vmNetworkPortgroup = value;
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
   public Boolean getToolboxDeploymentMode() {
      return toolboxDeploymentMode;
   }

   @JsonIgnore
   public void setToolboxDeploymentMode(Boolean value) { 
      this.toolboxDeploymentMode = value;
   }
   @JsonIgnore
   public String getToolboxGroup() {
      return toolboxGroup;
   }

   @JsonIgnore
   public void setToolboxGroup(String value) { 
      this.toolboxGroup = value;
   }
   @JsonIgnore
   public String getToolboxIP() {
      return toolboxIP;
   }

   @JsonIgnore
   public void setToolboxIP(String value) { 
      this.toolboxIP = value;
   }
   @JsonIgnore
   public String getToolboxPassword() {
      return toolboxPassword;
   }

   @JsonIgnore
   public void setToolboxPassword(String value) { 
      this.toolboxPassword = value;
   }
   @JsonIgnore
   public String getToolboxUserName() {
      return toolboxUserName;
   }

   @JsonIgnore
   public void setToolboxUserName(String value) { 
      this.toolboxUserName = value;
   }
   @JsonIgnore
   public Boolean getPortgroupMetadata() {
      return portgroupMetadata;
   }

   @JsonIgnore
   public void setPortgroupMetadata(Boolean value) { 
      this.portgroupMetadata = value;
   }
   @JsonIgnore
   public Long getNovaClientVersion() {
      return novaClientVersion;
   }

   @JsonIgnore
   public void setNovaClientVersion(Long value) { 
      this.novaClientVersion = value;
   }
   @JsonIgnore
   public String getNovaMetadataServiceAuthUrl() {
      return novaMetadataServiceAuthUrl;
   }

   @JsonIgnore
   public void setNovaMetadataServiceAuthUrl(String value) { 
      this.novaMetadataServiceAuthUrl = value;
   }
   @JsonIgnore
   public String getNovaMetadataServiceEndpoint() {
      return novaMetadataServiceEndpoint;
   }

   @JsonIgnore
   public void setNovaMetadataServiceEndpoint(String value) { 
      this.novaMetadataServiceEndpoint = value;
   }
   @JsonIgnore
   public String getNovaMetadataServicePassword() {
      return novaMetadataServicePassword;
   }

   @JsonIgnore
   public void setNovaMetadataServicePassword(String value) { 
      this.novaMetadataServicePassword = value;
   }
   @JsonIgnore
   public String getNovaMetadataServiceTenant() {
      return novaMetadataServiceTenant;
   }

   @JsonIgnore
   public void setNovaMetadataServiceTenant(String value) { 
      this.novaMetadataServiceTenant = value;
   }
   @JsonIgnore
   public String getNovaMetadataServiceUsername() {
      return novaMetadataServiceUsername;
   }

   @JsonIgnore
   public void setNovaMetadataServiceUsername(String value) { 
      this.novaMetadataServiceUsername = value;
   }
   @JsonIgnore
   public String getNovaMetadataSharedSecret() {
      return novaMetadataSharedSecret;
   }

   @JsonIgnore
   public void setNovaMetadataSharedSecret(String value) { 
      this.novaMetadataSharedSecret = value;
   }
   @JsonIgnore
   public String getNovaRegionName() {
      return novaRegionName;
   }

   @JsonIgnore
   public void setNovaRegionName(String value) { 
      this.novaRegionName = value;
   }
   @JsonIgnore
   public String getUpgradePackagePassword() {
      return upgradePackagePassword;
   }

   @JsonIgnore
   public void setUpgradePackagePassword(String value) { 
      this.upgradePackagePassword = value;
   }
   @JsonIgnore
   public String getUpgradePackageURL() {
      return upgradePackageURL;
   }

   @JsonIgnore
   public void setUpgradePackageURL(String value) { 
      this.upgradePackageURL = value;
   }
   @JsonIgnore
   public String getUpgradePackageUsername() {
      return upgradePackageUsername;
   }

   @JsonIgnore
   public void setUpgradePackageUsername(String value) { 
      this.upgradePackageUsername = value;
   }
   @JsonIgnore
   public Long getUpgradeScriptTimeLimit() {
      return upgradeScriptTimeLimit;
   }

   @JsonIgnore
   public void setUpgradeScriptTimeLimit(Long value) { 
      this.upgradeScriptTimeLimit = value;
   }
   @JsonIgnore
   public String getUpgradeStatus() {
      return upgradeStatus;
   }

   @JsonIgnore
   public void setUpgradeStatus(String value) { 
      this.upgradeStatus = value;
   }
   @JsonIgnore
   public Boolean getUpgradeTimedout() {
      return upgradeTimedout;
   }

   @JsonIgnore
   public void setUpgradeTimedout(Boolean value) { 
      this.upgradeTimedout = value;
   }
   @JsonIgnore
   public String getPrimaryNuageController() {
      return primaryNuageController;
   }

   @JsonIgnore
   public void setPrimaryNuageController(String value) { 
      this.primaryNuageController = value;
   }
   @JsonIgnore
   public String getVrsId() {
      return vrsId;
   }

   @JsonIgnore
   public void setVrsId(String value) { 
      this.vrsId = value;
   }
   @JsonIgnore
   public String getVrsPassword() {
      return vrsPassword;
   }

   @JsonIgnore
   public void setVrsPassword(String value) { 
      this.vrsPassword = value;
   }
   @JsonIgnore
   public String getVrsUserName() {
      return vrsUserName;
   }

   @JsonIgnore
   public void setVrsUserName(String value) { 
      this.vrsUserName = value;
   }
   @JsonIgnore
   public String getStaticRoute() {
      return staticRoute;
   }

   @JsonIgnore
   public void setStaticRoute(String value) { 
      this.staticRoute = value;
   }
   @JsonIgnore
   public String getStaticRouteGateway() {
      return staticRouteGateway;
   }

   @JsonIgnore
   public void setStaticRouteGateway(String value) { 
      this.staticRouteGateway = value;
   }
   @JsonIgnore
   public String getStaticRouteNetmask() {
      return staticRouteNetmask;
   }

   @JsonIgnore
   public void setStaticRouteNetmask(String value) { 
      this.staticRouteNetmask = value;
   }
   @JsonIgnore
   public String getNtpServer1() {
      return ntpServer1;
   }

   @JsonIgnore
   public void setNtpServer1(String value) { 
      this.ntpServer1 = value;
   }
   @JsonIgnore
   public String getNtpServer2() {
      return ntpServer2;
   }

   @JsonIgnore
   public void setNtpServer2(String value) { 
      this.ntpServer2 = value;
   }
   @JsonIgnore
   public Long getMtu() {
      return mtu;
   }

   @JsonIgnore
   public void setMtu(Long value) { 
      this.mtu = value;
   }
   @JsonIgnore
   public Boolean getMultiVMSsupport() {
      return multiVMSsupport;
   }

   @JsonIgnore
   public void setMultiVMSsupport(Boolean value) { 
      this.multiVMSsupport = value;
   }
   @JsonIgnore
   public String getMulticastReceiveInterface() {
      return multicastReceiveInterface;
   }

   @JsonIgnore
   public void setMulticastReceiveInterface(String value) { 
      this.multicastReceiveInterface = value;
   }
   @JsonIgnore
   public String getMulticastReceiveInterfaceIP() {
      return multicastReceiveInterfaceIP;
   }

   @JsonIgnore
   public void setMulticastReceiveInterfaceIP(String value) { 
      this.multicastReceiveInterfaceIP = value;
   }
   @JsonIgnore
   public String getMulticastReceiveInterfaceNetmask() {
      return multicastReceiveInterfaceNetmask;
   }

   @JsonIgnore
   public void setMulticastReceiveInterfaceNetmask(String value) { 
      this.multicastReceiveInterfaceNetmask = value;
   }
   @JsonIgnore
   public String getMulticastReceiveRange() {
      return multicastReceiveRange;
   }

   @JsonIgnore
   public void setMulticastReceiveRange(String value) { 
      this.multicastReceiveRange = value;
   }
   @JsonIgnore
   public String getMulticastSendInterface() {
      return multicastSendInterface;
   }

   @JsonIgnore
   public void setMulticastSendInterface(String value) { 
      this.multicastSendInterface = value;
   }
   @JsonIgnore
   public String getMulticastSendInterfaceIP() {
      return multicastSendInterfaceIP;
   }

   @JsonIgnore
   public void setMulticastSendInterfaceIP(String value) { 
      this.multicastSendInterfaceIP = value;
   }
   @JsonIgnore
   public String getMulticastSendInterfaceNetmask() {
      return multicastSendInterfaceNetmask;
   }

   @JsonIgnore
   public void setMulticastSendInterfaceNetmask(String value) { 
      this.multicastSendInterfaceNetmask = value;
   }
   @JsonIgnore
   public String getMulticastSourcePortgroup() {
      return multicastSourcePortgroup;
   }

   @JsonIgnore
   public void setMulticastSourcePortgroup(String value) { 
      this.multicastSourcePortgroup = value;
   }
   @JsonIgnore
   public String getCustomizedScriptURL() {
      return customizedScriptURL;
   }

   @JsonIgnore
   public void setCustomizedScriptURL(String value) { 
      this.customizedScriptURL = value;
   }
   @JsonIgnore
   public java.util.List<String> getAvailableNetworks() {
      return availableNetworks;
   }

   @JsonIgnore
   public void setAvailableNetworks(java.util.List<String> value) { 
      this.availableNetworks = value;
   }
   @JsonIgnore
   public String getOvfURL() {
      return ovfURL;
   }

   @JsonIgnore
   public void setOvfURL(String value) { 
      this.ovfURL = value;
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
   public String getHypervisorIP() {
      return hypervisorIP;
   }

   @JsonIgnore
   public void setHypervisorIP(String value) { 
      this.hypervisorIP = value;
   }
   @JsonIgnore
   public String getHypervisorPassword() {
      return hypervisorPassword;
   }

   @JsonIgnore
   public void setHypervisorPassword(String value) { 
      this.hypervisorPassword = value;
   }
   @JsonIgnore
   public String getHypervisorUser() {
      return hypervisorUser;
   }

   @JsonIgnore
   public void setHypervisorUser(String value) { 
      this.hypervisorUser = value;
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
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public VRSAddressRangesFetcher getVRSAddressRanges() {
      return vRSAddressRanges;
   }
   
   @JsonIgnore
   public VRSMetricsFetcher getVRSMetrics() {
      return vRSMetrics;
   }
   
   @JsonIgnore
   public VRSRedeploymentpoliciesFetcher getVRSRedeploymentpolicies() {
      return vRSRedeploymentpolicies;
   }
   

   public String toString() {
      return "VCenterHypervisor [" + "vCenterIP=" + vCenterIP + ", vCenterPassword=" + vCenterPassword + ", vCenterUser=" + vCenterUser + ", VRSConfigurationTimeLimit=" + VRSConfigurationTimeLimit + ", VRSMetricsID=" + VRSMetricsID + ", VRSState=" + VRSState + ", vRequireNuageMetadata=" + vRequireNuageMetadata + ", name=" + name + ", managedObjectID=" + managedObjectID + ", lastUpdatedBy=" + lastUpdatedBy + ", lastVRSDeployedDate=" + lastVRSDeployedDate + ", dataDNS1=" + dataDNS1 + ", dataDNS2=" + dataDNS2 + ", dataGateway=" + dataGateway + ", dataIPAddress=" + dataIPAddress + ", dataNetmask=" + dataNetmask + ", dataNetworkPortgroup=" + dataNetworkPortgroup + ", datapathSyncTimeout=" + datapathSyncTimeout + ", scope=" + scope + ", secondaryNuageController=" + secondaryNuageController + ", removedFromVCenterInventory=" + removedFromVCenterInventory + ", genericSplitActivation=" + genericSplitActivation + ", separateDataNetwork=" + separateDataNetwork + ", deploymentCount=" + deploymentCount + ", personality=" + personality + ", description=" + description + ", destinationMirrorPort=" + destinationMirrorPort + ", metadataServerIP=" + metadataServerIP + ", metadataServerListenPort=" + metadataServerListenPort + ", metadataServerPort=" + metadataServerPort + ", metadataServiceEnabled=" + metadataServiceEnabled + ", networkUplinkInterface=" + networkUplinkInterface + ", networkUplinkInterfaceGateway=" + networkUplinkInterfaceGateway + ", networkUplinkInterfaceIp=" + networkUplinkInterfaceIp + ", networkUplinkInterfaceNetmask=" + networkUplinkInterfaceNetmask + ", nfsLogServer=" + nfsLogServer + ", nfsMountPath=" + nfsMountPath + ", mgmtDNS1=" + mgmtDNS1 + ", mgmtDNS2=" + mgmtDNS2 + ", mgmtGateway=" + mgmtGateway + ", mgmtIPAddress=" + mgmtIPAddress + ", mgmtNetmask=" + mgmtNetmask + ", mgmtNetworkPortgroup=" + mgmtNetworkPortgroup + ", dhcpRelayServer=" + dhcpRelayServer + ", mirrorNetworkPortgroup=" + mirrorNetworkPortgroup + ", siteId=" + siteId + ", allowDataDHCP=" + allowDataDHCP + ", allowMgmtDHCP=" + allowMgmtDHCP + ", flowEvictionThreshold=" + flowEvictionThreshold + ", vmNetworkPortgroup=" + vmNetworkPortgroup + ", entityScope=" + entityScope + ", toolboxDeploymentMode=" + toolboxDeploymentMode + ", toolboxGroup=" + toolboxGroup + ", toolboxIP=" + toolboxIP + ", toolboxPassword=" + toolboxPassword + ", toolboxUserName=" + toolboxUserName + ", portgroupMetadata=" + portgroupMetadata + ", novaClientVersion=" + novaClientVersion + ", novaMetadataServiceAuthUrl=" + novaMetadataServiceAuthUrl + ", novaMetadataServiceEndpoint=" + novaMetadataServiceEndpoint + ", novaMetadataServicePassword=" + novaMetadataServicePassword + ", novaMetadataServiceTenant=" + novaMetadataServiceTenant + ", novaMetadataServiceUsername=" + novaMetadataServiceUsername + ", novaMetadataSharedSecret=" + novaMetadataSharedSecret + ", novaRegionName=" + novaRegionName + ", upgradePackagePassword=" + upgradePackagePassword + ", upgradePackageURL=" + upgradePackageURL + ", upgradePackageUsername=" + upgradePackageUsername + ", upgradeScriptTimeLimit=" + upgradeScriptTimeLimit + ", upgradeStatus=" + upgradeStatus + ", upgradeTimedout=" + upgradeTimedout + ", primaryNuageController=" + primaryNuageController + ", vrsId=" + vrsId + ", vrsPassword=" + vrsPassword + ", vrsUserName=" + vrsUserName + ", staticRoute=" + staticRoute + ", staticRouteGateway=" + staticRouteGateway + ", staticRouteNetmask=" + staticRouteNetmask + ", ntpServer1=" + ntpServer1 + ", ntpServer2=" + ntpServer2 + ", mtu=" + mtu + ", multiVMSsupport=" + multiVMSsupport + ", multicastReceiveInterface=" + multicastReceiveInterface + ", multicastReceiveInterfaceIP=" + multicastReceiveInterfaceIP + ", multicastReceiveInterfaceNetmask=" + multicastReceiveInterfaceNetmask + ", multicastReceiveRange=" + multicastReceiveRange + ", multicastSendInterface=" + multicastSendInterface + ", multicastSendInterfaceIP=" + multicastSendInterfaceIP + ", multicastSendInterfaceNetmask=" + multicastSendInterfaceNetmask + ", multicastSourcePortgroup=" + multicastSourcePortgroup + ", customizedScriptURL=" + customizedScriptURL + ", availableNetworks=" + availableNetworks + ", ovfURL=" + ovfURL + ", externalID=" + externalID + ", hypervisorIP=" + hypervisorIP + ", hypervisorPassword=" + hypervisorPassword + ", hypervisorUser=" + hypervisorUser + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}