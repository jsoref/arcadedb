/* Generated by: JJTree: Do not edit this line. Type.java Version 1.1 */
/* ParserGeneratorCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.arcadedb.graphql.parser;

public class Type extends SimpleNode {
  protected TypeName typeName;
  boolean bang = false;
  protected ListType listType;

  public Type(int id) {
    super(id);
  }

  public Type(GraphQLParser p, int id) {
    super(p, id);
  }

  public ListType getListType() {
    return listType;
  }

  public TypeName getTypeName() {
    return typeName;
  }

  public boolean isBang() {
    return bang;
  }

  /**
   * Accept the visitor.
   **/
  public Object jjtAccept(GraphQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* ParserGeneratorCC - OriginalChecksum=c03be8fb7a8fc8bf149d18a7ff368c74 (do not edit this line) */
