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



@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "overlaypatnatentry", resourceName = "overlaypatnatentries")
public class OverlayPATNATEntry extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "NATEnabled")
   protected String NATEnabled;
   
   @JsonProperty(value = "privateIP")
   protected String privateIP;
   
   @JsonProperty(value = "associatedDomainID")
   protected String associatedDomainID;
   
   @JsonProperty(value = "associatedLinkID")
   protected String associatedLinkID;
   
   @JsonProperty(value = "publicIP")
   protected String publicIP;
   

   

   public OverlayPATNATEntry() {
      
   }

   @JsonIgnore
   public String getNATEnabled() {
      return NATEnabled;
   }

   @JsonIgnore
   public void setNATEnabled(String value) { 
      this.NATEnabled = value;
   }
   @JsonIgnore
   public String getPrivateIP() {
      return privateIP;
   }

   @JsonIgnore
   public void setPrivateIP(String value) { 
      this.privateIP = value;
   }
   @JsonIgnore
   public String getAssociatedDomainID() {
      return associatedDomainID;
   }

   @JsonIgnore
   public void setAssociatedDomainID(String value) { 
      this.associatedDomainID = value;
   }
   @JsonIgnore
   public String getAssociatedLinkID() {
      return associatedLinkID;
   }

   @JsonIgnore
   public void setAssociatedLinkID(String value) { 
      this.associatedLinkID = value;
   }
   @JsonIgnore
   public String getPublicIP() {
      return publicIP;
   }

   @JsonIgnore
   public void setPublicIP(String value) { 
      this.publicIP = value;
   }
   

   

   public String toString() {
      return "OverlayPATNATEntry [" + "NATEnabled=" + NATEnabled + ", privateIP=" + privateIP + ", associatedDomainID=" + associatedDomainID + ", associatedLinkID=" + associatedLinkID + ", publicIP=" + publicIP + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}