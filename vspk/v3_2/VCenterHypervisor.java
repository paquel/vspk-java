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
import vspk.v3_2.fetchers.JobsFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.VRSAddressRangesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VCenterHypervisor extends RestObject {

   public final static String REST_NAME = "vcenterhypervisor";
   public final static String RESOURCE_NAME = "vcenterhypervisors";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "allowDataDHCP")
   protected boolean allowDataDHCP;
   
   @JsonProperty(value = "allowMgmtDHCP")
   protected boolean allowMgmtDHCP;
   
   @JsonProperty(value = "associatedClusterID")
   protected String associatedClusterID;
   
   @JsonProperty(value = "customizedScriptURL")
   protected String customizedScriptURL;
   
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
   protected int datapathSyncTimeout;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "dhcpRelayServer")
   protected String dhcpRelayServer;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "flowEvictionThreshold")
   protected int flowEvictionThreshold;
   
   @JsonProperty(value = "hypervisorIP")
   protected String hypervisorIP;
   
   @JsonProperty(value = "hypervisorPassword")
   protected String hypervisorPassword;
   
   @JsonProperty(value = "hypervisorUser")
   protected String hypervisorUser;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "metadataServerIP")
   protected String metadataServerIP;
   
   @JsonProperty(value = "metadataServerListenPort")
   protected int metadataServerListenPort;
   
   @JsonProperty(value = "metadataServerPort")
   protected int metadataServerPort;
   
   @JsonProperty(value = "metadataServiceEnabled")
   protected boolean metadataServiceEnabled;
   
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
   
   @JsonProperty(value = "mtu")
   protected int mtu;
   
   @JsonProperty(value = "multiVMSsupport")
   protected boolean multiVMSsupport;
   
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
   
   @JsonProperty(value = "name")
   protected String name;
   
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
   
   @JsonProperty(value = "novaClientVersion")
   protected int novaClientVersion;
   
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
   
   @JsonProperty(value = "ntpServer1")
   protected String ntpServer1;
   
   @JsonProperty(value = "ntpServer2")
   protected String ntpServer2;
   
   @JsonProperty(value = "personality")
   protected String personality;
   
   @JsonProperty(value = "portgroupMetadata")
   protected boolean portgroupMetadata;
   
   @JsonProperty(value = "primaryNuageController")
   protected String primaryNuageController;
   
   @JsonProperty(value = "secondaryNuageController")
   protected String secondaryNuageController;
   
   @JsonProperty(value = "separateDataNetwork")
   protected boolean separateDataNetwork;
   
   @JsonProperty(value = "siteId")
   protected String siteId;
   
   @JsonProperty(value = "staticRoute")
   protected String staticRoute;
   
   @JsonProperty(value = "staticRouteGateway")
   protected String staticRouteGateway;
   
   @JsonProperty(value = "staticRouteNetmask")
   protected String staticRouteNetmask;
   
   @JsonProperty(value = "toolboxDeploymentMode")
   protected boolean toolboxDeploymentMode;
   
   @JsonProperty(value = "toolboxGroup")
   protected String toolboxGroup;
   
   @JsonProperty(value = "toolboxIP")
   protected String toolboxIP;
   
   @JsonProperty(value = "toolboxPassword")
   protected String toolboxPassword;
   
   @JsonProperty(value = "toolboxUserName")
   protected String toolboxUserName;
   
   @JsonProperty(value = "vCenterIP")
   protected String vCenterIP;
   
   @JsonProperty(value = "vCenterPassword")
   protected String vCenterPassword;
   
   @JsonProperty(value = "vCenterUser")
   protected String vCenterUser;
   
   @JsonProperty(value = "vRequireNuageMetadata")
   protected boolean vRequireNuageMetadata;
   
   @JsonProperty(value = "vmNetworkPortgroup")
   protected String vmNetworkPortgroup;
   
   @JsonProperty(value = "vrsId")
   protected String vrsId;
   
   @JsonProperty(value = "vrsPassword")
   protected String vrsPassword;
   
   @JsonProperty(value = "vrsUserName")
   protected String vrsUserName;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VRSAddressRangesFetcher vRSAddressRanges;
   

   public VCenterHypervisor() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vRSAddressRanges = new VRSAddressRangesFetcher(this);
      
   }

   public boolean getAllowDataDHCP() {
      return allowDataDHCP;
   }

   public void setAllowDataDHCP(boolean value) { 
      this.allowDataDHCP = value;
   }
   public boolean getAllowMgmtDHCP() {
      return allowMgmtDHCP;
   }

   public void setAllowMgmtDHCP(boolean value) { 
      this.allowMgmtDHCP = value;
   }
   public String getAssociatedClusterID() {
      return associatedClusterID;
   }

   public void setAssociatedClusterID(String value) { 
      this.associatedClusterID = value;
   }
   public String getCustomizedScriptURL() {
      return customizedScriptURL;
   }

   public void setCustomizedScriptURL(String value) { 
      this.customizedScriptURL = value;
   }
   public String getDataDNS1() {
      return dataDNS1;
   }

   public void setDataDNS1(String value) { 
      this.dataDNS1 = value;
   }
   public String getDataDNS2() {
      return dataDNS2;
   }

   public void setDataDNS2(String value) { 
      this.dataDNS2 = value;
   }
   public String getDataGateway() {
      return dataGateway;
   }

   public void setDataGateway(String value) { 
      this.dataGateway = value;
   }
   public String getDataIPAddress() {
      return dataIPAddress;
   }

   public void setDataIPAddress(String value) { 
      this.dataIPAddress = value;
   }
   public String getDataNetmask() {
      return dataNetmask;
   }

   public void setDataNetmask(String value) { 
      this.dataNetmask = value;
   }
   public String getDataNetworkPortgroup() {
      return dataNetworkPortgroup;
   }

   public void setDataNetworkPortgroup(String value) { 
      this.dataNetworkPortgroup = value;
   }
   public int getDatapathSyncTimeout() {
      return datapathSyncTimeout;
   }

   public void setDatapathSyncTimeout(int value) { 
      this.datapathSyncTimeout = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public String getDhcpRelayServer() {
      return dhcpRelayServer;
   }

   public void setDhcpRelayServer(String value) { 
      this.dhcpRelayServer = value;
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
   public int getFlowEvictionThreshold() {
      return flowEvictionThreshold;
   }

   public void setFlowEvictionThreshold(int value) { 
      this.flowEvictionThreshold = value;
   }
   public String getHypervisorIP() {
      return hypervisorIP;
   }

   public void setHypervisorIP(String value) { 
      this.hypervisorIP = value;
   }
   public String getHypervisorPassword() {
      return hypervisorPassword;
   }

   public void setHypervisorPassword(String value) { 
      this.hypervisorPassword = value;
   }
   public String getHypervisorUser() {
      return hypervisorUser;
   }

   public void setHypervisorUser(String value) { 
      this.hypervisorUser = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getMetadataServerIP() {
      return metadataServerIP;
   }

   public void setMetadataServerIP(String value) { 
      this.metadataServerIP = value;
   }
   public int getMetadataServerListenPort() {
      return metadataServerListenPort;
   }

   public void setMetadataServerListenPort(int value) { 
      this.metadataServerListenPort = value;
   }
   public int getMetadataServerPort() {
      return metadataServerPort;
   }

   public void setMetadataServerPort(int value) { 
      this.metadataServerPort = value;
   }
   public boolean getMetadataServiceEnabled() {
      return metadataServiceEnabled;
   }

   public void setMetadataServiceEnabled(boolean value) { 
      this.metadataServiceEnabled = value;
   }
   public String getMgmtDNS1() {
      return mgmtDNS1;
   }

   public void setMgmtDNS1(String value) { 
      this.mgmtDNS1 = value;
   }
   public String getMgmtDNS2() {
      return mgmtDNS2;
   }

   public void setMgmtDNS2(String value) { 
      this.mgmtDNS2 = value;
   }
   public String getMgmtGateway() {
      return mgmtGateway;
   }

   public void setMgmtGateway(String value) { 
      this.mgmtGateway = value;
   }
   public String getMgmtIPAddress() {
      return mgmtIPAddress;
   }

   public void setMgmtIPAddress(String value) { 
      this.mgmtIPAddress = value;
   }
   public String getMgmtNetmask() {
      return mgmtNetmask;
   }

   public void setMgmtNetmask(String value) { 
      this.mgmtNetmask = value;
   }
   public String getMgmtNetworkPortgroup() {
      return mgmtNetworkPortgroup;
   }

   public void setMgmtNetworkPortgroup(String value) { 
      this.mgmtNetworkPortgroup = value;
   }
   public int getMtu() {
      return mtu;
   }

   public void setMtu(int value) { 
      this.mtu = value;
   }
   public boolean getMultiVMSsupport() {
      return multiVMSsupport;
   }

   public void setMultiVMSsupport(boolean value) { 
      this.multiVMSsupport = value;
   }
   public String getMulticastReceiveInterface() {
      return multicastReceiveInterface;
   }

   public void setMulticastReceiveInterface(String value) { 
      this.multicastReceiveInterface = value;
   }
   public String getMulticastReceiveInterfaceIP() {
      return multicastReceiveInterfaceIP;
   }

   public void setMulticastReceiveInterfaceIP(String value) { 
      this.multicastReceiveInterfaceIP = value;
   }
   public String getMulticastReceiveInterfaceNetmask() {
      return multicastReceiveInterfaceNetmask;
   }

   public void setMulticastReceiveInterfaceNetmask(String value) { 
      this.multicastReceiveInterfaceNetmask = value;
   }
   public String getMulticastReceiveRange() {
      return multicastReceiveRange;
   }

   public void setMulticastReceiveRange(String value) { 
      this.multicastReceiveRange = value;
   }
   public String getMulticastSendInterface() {
      return multicastSendInterface;
   }

   public void setMulticastSendInterface(String value) { 
      this.multicastSendInterface = value;
   }
   public String getMulticastSendInterfaceIP() {
      return multicastSendInterfaceIP;
   }

   public void setMulticastSendInterfaceIP(String value) { 
      this.multicastSendInterfaceIP = value;
   }
   public String getMulticastSendInterfaceNetmask() {
      return multicastSendInterfaceNetmask;
   }

   public void setMulticastSendInterfaceNetmask(String value) { 
      this.multicastSendInterfaceNetmask = value;
   }
   public String getMulticastSourcePortgroup() {
      return multicastSourcePortgroup;
   }

   public void setMulticastSourcePortgroup(String value) { 
      this.multicastSourcePortgroup = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public String getNetworkUplinkInterface() {
      return networkUplinkInterface;
   }

   public void setNetworkUplinkInterface(String value) { 
      this.networkUplinkInterface = value;
   }
   public String getNetworkUplinkInterfaceGateway() {
      return networkUplinkInterfaceGateway;
   }

   public void setNetworkUplinkInterfaceGateway(String value) { 
      this.networkUplinkInterfaceGateway = value;
   }
   public String getNetworkUplinkInterfaceIp() {
      return networkUplinkInterfaceIp;
   }

   public void setNetworkUplinkInterfaceIp(String value) { 
      this.networkUplinkInterfaceIp = value;
   }
   public String getNetworkUplinkInterfaceNetmask() {
      return networkUplinkInterfaceNetmask;
   }

   public void setNetworkUplinkInterfaceNetmask(String value) { 
      this.networkUplinkInterfaceNetmask = value;
   }
   public String getNfsLogServer() {
      return nfsLogServer;
   }

   public void setNfsLogServer(String value) { 
      this.nfsLogServer = value;
   }
   public String getNfsMountPath() {
      return nfsMountPath;
   }

   public void setNfsMountPath(String value) { 
      this.nfsMountPath = value;
   }
   public int getNovaClientVersion() {
      return novaClientVersion;
   }

   public void setNovaClientVersion(int value) { 
      this.novaClientVersion = value;
   }
   public String getNovaMetadataServiceAuthUrl() {
      return novaMetadataServiceAuthUrl;
   }

   public void setNovaMetadataServiceAuthUrl(String value) { 
      this.novaMetadataServiceAuthUrl = value;
   }
   public String getNovaMetadataServiceEndpoint() {
      return novaMetadataServiceEndpoint;
   }

   public void setNovaMetadataServiceEndpoint(String value) { 
      this.novaMetadataServiceEndpoint = value;
   }
   public String getNovaMetadataServicePassword() {
      return novaMetadataServicePassword;
   }

   public void setNovaMetadataServicePassword(String value) { 
      this.novaMetadataServicePassword = value;
   }
   public String getNovaMetadataServiceTenant() {
      return novaMetadataServiceTenant;
   }

   public void setNovaMetadataServiceTenant(String value) { 
      this.novaMetadataServiceTenant = value;
   }
   public String getNovaMetadataServiceUsername() {
      return novaMetadataServiceUsername;
   }

   public void setNovaMetadataServiceUsername(String value) { 
      this.novaMetadataServiceUsername = value;
   }
   public String getNovaMetadataSharedSecret() {
      return novaMetadataSharedSecret;
   }

   public void setNovaMetadataSharedSecret(String value) { 
      this.novaMetadataSharedSecret = value;
   }
   public String getNovaRegionName() {
      return novaRegionName;
   }

   public void setNovaRegionName(String value) { 
      this.novaRegionName = value;
   }
   public String getNtpServer1() {
      return ntpServer1;
   }

   public void setNtpServer1(String value) { 
      this.ntpServer1 = value;
   }
   public String getNtpServer2() {
      return ntpServer2;
   }

   public void setNtpServer2(String value) { 
      this.ntpServer2 = value;
   }
   public String getPersonality() {
      return personality;
   }

   public void setPersonality(String value) { 
      this.personality = value;
   }
   public boolean getPortgroupMetadata() {
      return portgroupMetadata;
   }

   public void setPortgroupMetadata(boolean value) { 
      this.portgroupMetadata = value;
   }
   public String getPrimaryNuageController() {
      return primaryNuageController;
   }

   public void setPrimaryNuageController(String value) { 
      this.primaryNuageController = value;
   }
   public String getSecondaryNuageController() {
      return secondaryNuageController;
   }

   public void setSecondaryNuageController(String value) { 
      this.secondaryNuageController = value;
   }
   public boolean getSeparateDataNetwork() {
      return separateDataNetwork;
   }

   public void setSeparateDataNetwork(boolean value) { 
      this.separateDataNetwork = value;
   }
   public String getSiteId() {
      return siteId;
   }

   public void setSiteId(String value) { 
      this.siteId = value;
   }
   public String getStaticRoute() {
      return staticRoute;
   }

   public void setStaticRoute(String value) { 
      this.staticRoute = value;
   }
   public String getStaticRouteGateway() {
      return staticRouteGateway;
   }

   public void setStaticRouteGateway(String value) { 
      this.staticRouteGateway = value;
   }
   public String getStaticRouteNetmask() {
      return staticRouteNetmask;
   }

   public void setStaticRouteNetmask(String value) { 
      this.staticRouteNetmask = value;
   }
   public boolean getToolboxDeploymentMode() {
      return toolboxDeploymentMode;
   }

   public void setToolboxDeploymentMode(boolean value) { 
      this.toolboxDeploymentMode = value;
   }
   public String getToolboxGroup() {
      return toolboxGroup;
   }

   public void setToolboxGroup(String value) { 
      this.toolboxGroup = value;
   }
   public String getToolboxIP() {
      return toolboxIP;
   }

   public void setToolboxIP(String value) { 
      this.toolboxIP = value;
   }
   public String getToolboxPassword() {
      return toolboxPassword;
   }

   public void setToolboxPassword(String value) { 
      this.toolboxPassword = value;
   }
   public String getToolboxUserName() {
      return toolboxUserName;
   }

   public void setToolboxUserName(String value) { 
      this.toolboxUserName = value;
   }
   public String getVCenterIP() {
      return vCenterIP;
   }

   public void setVCenterIP(String value) { 
      this.vCenterIP = value;
   }
   public String getVCenterPassword() {
      return vCenterPassword;
   }

   public void setVCenterPassword(String value) { 
      this.vCenterPassword = value;
   }
   public String getVCenterUser() {
      return vCenterUser;
   }

   public void setVCenterUser(String value) { 
      this.vCenterUser = value;
   }
   public boolean getVRequireNuageMetadata() {
      return vRequireNuageMetadata;
   }

   public void setVRequireNuageMetadata(boolean value) { 
      this.vRequireNuageMetadata = value;
   }
   public String getVmNetworkPortgroup() {
      return vmNetworkPortgroup;
   }

   public void setVmNetworkPortgroup(String value) { 
      this.vmNetworkPortgroup = value;
   }
   public String getVrsId() {
      return vrsId;
   }

   public void setVrsId(String value) { 
      this.vrsId = value;
   }
   public String getVrsPassword() {
      return vrsPassword;
   }

   public void setVrsPassword(String value) { 
      this.vrsPassword = value;
   }
   public String getVrsUserName() {
      return vrsUserName;
   }

   public void setVrsUserName(String value) { 
      this.vrsUserName = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public VRSAddressRangesFetcher getVRSAddressRanges() {
      return vRSAddressRanges;
   }
   

   public String toString() {
      return "VCenterHypervisor [" + "allowDataDHCP=" + allowDataDHCP + ", allowMgmtDHCP=" + allowMgmtDHCP + ", associatedClusterID=" + associatedClusterID + ", customizedScriptURL=" + customizedScriptURL + ", dataDNS1=" + dataDNS1 + ", dataDNS2=" + dataDNS2 + ", dataGateway=" + dataGateway + ", dataIPAddress=" + dataIPAddress + ", dataNetmask=" + dataNetmask + ", dataNetworkPortgroup=" + dataNetworkPortgroup + ", datapathSyncTimeout=" + datapathSyncTimeout + ", description=" + description + ", dhcpRelayServer=" + dhcpRelayServer + ", entityScope=" + entityScope + ", externalID=" + externalID + ", flowEvictionThreshold=" + flowEvictionThreshold + ", hypervisorIP=" + hypervisorIP + ", hypervisorPassword=" + hypervisorPassword + ", hypervisorUser=" + hypervisorUser + ", lastUpdatedBy=" + lastUpdatedBy + ", metadataServerIP=" + metadataServerIP + ", metadataServerListenPort=" + metadataServerListenPort + ", metadataServerPort=" + metadataServerPort + ", metadataServiceEnabled=" + metadataServiceEnabled + ", mgmtDNS1=" + mgmtDNS1 + ", mgmtDNS2=" + mgmtDNS2 + ", mgmtGateway=" + mgmtGateway + ", mgmtIPAddress=" + mgmtIPAddress + ", mgmtNetmask=" + mgmtNetmask + ", mgmtNetworkPortgroup=" + mgmtNetworkPortgroup + ", mtu=" + mtu + ", multiVMSsupport=" + multiVMSsupport + ", multicastReceiveInterface=" + multicastReceiveInterface + ", multicastReceiveInterfaceIP=" + multicastReceiveInterfaceIP + ", multicastReceiveInterfaceNetmask=" + multicastReceiveInterfaceNetmask + ", multicastReceiveRange=" + multicastReceiveRange + ", multicastSendInterface=" + multicastSendInterface + ", multicastSendInterfaceIP=" + multicastSendInterfaceIP + ", multicastSendInterfaceNetmask=" + multicastSendInterfaceNetmask + ", multicastSourcePortgroup=" + multicastSourcePortgroup + ", name=" + name + ", networkUplinkInterface=" + networkUplinkInterface + ", networkUplinkInterfaceGateway=" + networkUplinkInterfaceGateway + ", networkUplinkInterfaceIp=" + networkUplinkInterfaceIp + ", networkUplinkInterfaceNetmask=" + networkUplinkInterfaceNetmask + ", nfsLogServer=" + nfsLogServer + ", nfsMountPath=" + nfsMountPath + ", novaClientVersion=" + novaClientVersion + ", novaMetadataServiceAuthUrl=" + novaMetadataServiceAuthUrl + ", novaMetadataServiceEndpoint=" + novaMetadataServiceEndpoint + ", novaMetadataServicePassword=" + novaMetadataServicePassword + ", novaMetadataServiceTenant=" + novaMetadataServiceTenant + ", novaMetadataServiceUsername=" + novaMetadataServiceUsername + ", novaMetadataSharedSecret=" + novaMetadataSharedSecret + ", novaRegionName=" + novaRegionName + ", ntpServer1=" + ntpServer1 + ", ntpServer2=" + ntpServer2 + ", personality=" + personality + ", portgroupMetadata=" + portgroupMetadata + ", primaryNuageController=" + primaryNuageController + ", secondaryNuageController=" + secondaryNuageController + ", separateDataNetwork=" + separateDataNetwork + ", siteId=" + siteId + ", staticRoute=" + staticRoute + ", staticRouteGateway=" + staticRouteGateway + ", staticRouteNetmask=" + staticRouteNetmask + ", toolboxDeploymentMode=" + toolboxDeploymentMode + ", toolboxGroup=" + toolboxGroup + ", toolboxIP=" + toolboxIP + ", toolboxPassword=" + toolboxPassword + ", toolboxUserName=" + toolboxUserName + ", vCenterIP=" + vCenterIP + ", vCenterPassword=" + vCenterPassword + ", vCenterUser=" + vCenterUser + ", vRequireNuageMetadata=" + vRequireNuageMetadata + ", vmNetworkPortgroup=" + vmNetworkPortgroup + ", vrsId=" + vrsId + ", vrsPassword=" + vrsPassword + ", vrsUserName=" + vrsUserName + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}