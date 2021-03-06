/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.data.cassandra.entity;

import java.util.Map;

import org.springframework.data.cassandra.mapping.Indexed;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "Product")
public class ProductCassandraEntity {

   @PrimaryKey
   private String id;

   private String productId;

   @Indexed
   private String url;

   private Map<String, String> priceOnDateMap;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getProductId() {
      return productId;
   }

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public Map<String, String> getPriceOnDateMap() {
      return priceOnDateMap;
   }

   public void setPriceOnDateMap(Map<String, String> priceOnDateMap) {
      this.priceOnDateMap = priceOnDateMap;
   }

   @Override
   public String toString() {
      return "ProductCassandraEntity [id=" + id + ", productId=" + productId + ", priceOnDateMap=" + priceOnDateMap
            + "]";
   }

}
