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
/* Generated by: JJTree: Do not edit this line. Selection.java Version 1.1 */
/* ParserGeneratorCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.arcadedb.graphql.parser;

public class Selection extends SimpleNode {

  protected Name           name;
  protected FieldWithAlias fieldWithAlias;
  protected Field          field;
  protected boolean        ellipsis = false;
  protected FragmentSpread fragmentSpread;
  protected InlineFragment inlineFragment;

  public Selection(int id) {
    super(id);
  }

  public Selection(GraphQLParser p, int id) {
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

  public Field getField() {
    return field;
  }

  public FieldWithAlias getFieldWithAlias() {
    return fieldWithAlias;
  }
}
/* ParserGeneratorCC - OriginalChecksum=aac9a2d576730b830f5ef7c02bdf7951 (do not edit this line) */