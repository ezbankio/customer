/*
 * Copyright 2016 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.customer.service.internal.command;

public class DeleteIdentificationCardScanCommand {

  private final String number;

  private final String scanIdentifier;

  public DeleteIdentificationCardScanCommand(final String number, final String scanIdentifier) {
    this.number = number;
    this.scanIdentifier = scanIdentifier;
  }

  public String number() { return number; }

  public String scanIdentifier() {
    return scanIdentifier;
  }
}