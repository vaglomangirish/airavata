    /*
     * Licensed to the Apache Software Foundation (ASF) under one or more
     * contributor license agreements.  See the NOTICE file distributed with
     * this work for additional information regarding copyright ownership.
     * The ASF licenses this file to You under the Apache License, Version 2.0
     * (the "License"); you may not use this file except in compliance with
     * the License.  You may obtain a copy of the License at
     *
     *     http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.computeresource;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Enumeration of local resource job managers supported by Airavata
 * 
 * FORK:
 *  Forking of commands without any job manager
 * 
 * PBS:
 *  Job manager supporting the Portal Batch System (PBS) protocol. Some examples include TORQUE, PBSPro, Grid Engine.
 * 
 * UGE:
 *  Univa Grid Engine, a variation of PBS implementation.
 * 
 * SLURM:
 *  The Simple Linux Utility for Resource Management is a open source workload manager.
 * 
 */
@SuppressWarnings("all") public enum ResourceJobManager implements org.apache.thrift.TEnum {
  FORK(0),
  PBS(1),
  UGE(2),
  SLURM(3);

  private final int value;

  private ResourceJobManager(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ResourceJobManager findByValue(int value) { 
    switch (value) {
      case 0:
        return FORK;
      case 1:
        return PBS;
      case 2:
        return UGE;
      case 3:
        return SLURM;
      default:
        return null;
    }
  }
}
