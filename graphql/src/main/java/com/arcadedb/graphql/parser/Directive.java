/*
 * Copyright © 2021-present Arcade Data Ltd (info@arcadedata.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* Generated by: JJTree: Do not edit this line. Directive.java Version 1.1 */
/* ParserGeneratorCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.arcadedb.graphql.parser;

public class Directive extends SimpleNode {

  protected Name      name;
  protected Arguments arguments;

  public Directive(int id) {
    super(id);
  }

  public Directive(GraphQLParser p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public Object jjtAccept(GraphQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public String getName() {
    return name != null ? name.value : null;
  }

  public Arguments getArguments() {
    return arguments;
  }

  @Override
  public String toString() {
    return "Directive{" + name.value + " arguments=" + arguments + '}';
  }
}
/* ParserGeneratorCC - OriginalChecksum=2ab2407d8f843d5e31ff6480a48183d5 (do not edit this line) */