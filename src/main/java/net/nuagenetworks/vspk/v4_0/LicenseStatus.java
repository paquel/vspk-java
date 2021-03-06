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
@RestEntity(restName = "licensestatus", resourceName = "licensestatus")
public class LicenseStatus extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "accumulateLicensesEnabled")
   protected Boolean accumulateLicensesEnabled;
   
   @JsonProperty(value = "totalLicensedAVRSGsCount")
   protected Long totalLicensedAVRSGsCount;
   
   @JsonProperty(value = "totalLicensedAVRSsCount")
   protected Long totalLicensedAVRSsCount;
   
   @JsonProperty(value = "totalLicensedGatewaysCount")
   protected Long totalLicensedGatewaysCount;
   
   @JsonProperty(value = "totalLicensedNICsCount")
   protected Long totalLicensedNICsCount;
   
   @JsonProperty(value = "totalLicensedNSGsCount")
   protected Long totalLicensedNSGsCount;
   
   @JsonProperty(value = "totalLicensedUsedAVRSGsCount")
   protected Long totalLicensedUsedAVRSGsCount;
   
   @JsonProperty(value = "totalLicensedUsedAVRSsCount")
   protected Long totalLicensedUsedAVRSsCount;
   
   @JsonProperty(value = "totalLicensedUsedNICsCount")
   protected Long totalLicensedUsedNICsCount;
   
   @JsonProperty(value = "totalLicensedUsedNSGsCount")
   protected Long totalLicensedUsedNSGsCount;
   
   @JsonProperty(value = "totalLicensedUsedVMsCount")
   protected Long totalLicensedUsedVMsCount;
   
   @JsonProperty(value = "totalLicensedUsedVRSGsCount")
   protected Long totalLicensedUsedVRSGsCount;
   
   @JsonProperty(value = "totalLicensedUsedVRSsCount")
   protected Long totalLicensedUsedVRSsCount;
   
   @JsonProperty(value = "totalLicensedVMsCount")
   protected Long totalLicensedVMsCount;
   
   @JsonProperty(value = "totalLicensedVRSGsCount")
   protected Long totalLicensedVRSGsCount;
   
   @JsonProperty(value = "totalLicensedVRSsCount")
   protected Long totalLicensedVRSsCount;
   
   @JsonProperty(value = "totalUsedGatewaysCount")
   protected Long totalUsedGatewaysCount;
   

   

   public LicenseStatus() {
      
   }

   @JsonIgnore
   public Boolean getAccumulateLicensesEnabled() {
      return accumulateLicensesEnabled;
   }

   @JsonIgnore
   public void setAccumulateLicensesEnabled(Boolean value) { 
      this.accumulateLicensesEnabled = value;
   }
   @JsonIgnore
   public Long getTotalLicensedAVRSGsCount() {
      return totalLicensedAVRSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedAVRSGsCount(Long value) { 
      this.totalLicensedAVRSGsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedAVRSsCount() {
      return totalLicensedAVRSsCount;
   }

   @JsonIgnore
   public void setTotalLicensedAVRSsCount(Long value) { 
      this.totalLicensedAVRSsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedGatewaysCount() {
      return totalLicensedGatewaysCount;
   }

   @JsonIgnore
   public void setTotalLicensedGatewaysCount(Long value) { 
      this.totalLicensedGatewaysCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedNICsCount() {
      return totalLicensedNICsCount;
   }

   @JsonIgnore
   public void setTotalLicensedNICsCount(Long value) { 
      this.totalLicensedNICsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedNSGsCount() {
      return totalLicensedNSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedNSGsCount(Long value) { 
      this.totalLicensedNSGsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedUsedAVRSGsCount() {
      return totalLicensedUsedAVRSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedAVRSGsCount(Long value) { 
      this.totalLicensedUsedAVRSGsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedUsedAVRSsCount() {
      return totalLicensedUsedAVRSsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedAVRSsCount(Long value) { 
      this.totalLicensedUsedAVRSsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedUsedNICsCount() {
      return totalLicensedUsedNICsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedNICsCount(Long value) { 
      this.totalLicensedUsedNICsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedUsedNSGsCount() {
      return totalLicensedUsedNSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedNSGsCount(Long value) { 
      this.totalLicensedUsedNSGsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedUsedVMsCount() {
      return totalLicensedUsedVMsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedVMsCount(Long value) { 
      this.totalLicensedUsedVMsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedUsedVRSGsCount() {
      return totalLicensedUsedVRSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedVRSGsCount(Long value) { 
      this.totalLicensedUsedVRSGsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedUsedVRSsCount() {
      return totalLicensedUsedVRSsCount;
   }

   @JsonIgnore
   public void setTotalLicensedUsedVRSsCount(Long value) { 
      this.totalLicensedUsedVRSsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedVMsCount() {
      return totalLicensedVMsCount;
   }

   @JsonIgnore
   public void setTotalLicensedVMsCount(Long value) { 
      this.totalLicensedVMsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedVRSGsCount() {
      return totalLicensedVRSGsCount;
   }

   @JsonIgnore
   public void setTotalLicensedVRSGsCount(Long value) { 
      this.totalLicensedVRSGsCount = value;
   }
   @JsonIgnore
   public Long getTotalLicensedVRSsCount() {
      return totalLicensedVRSsCount;
   }

   @JsonIgnore
   public void setTotalLicensedVRSsCount(Long value) { 
      this.totalLicensedVRSsCount = value;
   }
   @JsonIgnore
   public Long getTotalUsedGatewaysCount() {
      return totalUsedGatewaysCount;
   }

   @JsonIgnore
   public void setTotalUsedGatewaysCount(Long value) { 
      this.totalUsedGatewaysCount = value;
   }
   

   

   public String toString() {
      return "LicenseStatus [" + "accumulateLicensesEnabled=" + accumulateLicensesEnabled + ", totalLicensedAVRSGsCount=" + totalLicensedAVRSGsCount + ", totalLicensedAVRSsCount=" + totalLicensedAVRSsCount + ", totalLicensedGatewaysCount=" + totalLicensedGatewaysCount + ", totalLicensedNICsCount=" + totalLicensedNICsCount + ", totalLicensedNSGsCount=" + totalLicensedNSGsCount + ", totalLicensedUsedAVRSGsCount=" + totalLicensedUsedAVRSGsCount + ", totalLicensedUsedAVRSsCount=" + totalLicensedUsedAVRSsCount + ", totalLicensedUsedNICsCount=" + totalLicensedUsedNICsCount + ", totalLicensedUsedNSGsCount=" + totalLicensedUsedNSGsCount + ", totalLicensedUsedVMsCount=" + totalLicensedUsedVMsCount + ", totalLicensedUsedVRSGsCount=" + totalLicensedUsedVRSGsCount + ", totalLicensedUsedVRSsCount=" + totalLicensedUsedVRSsCount + ", totalLicensedVMsCount=" + totalLicensedVMsCount + ", totalLicensedVRSGsCount=" + totalLicensedVRSGsCount + ", totalLicensedVRSsCount=" + totalLicensedVRSsCount + ", totalUsedGatewaysCount=" + totalUsedGatewaysCount + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}