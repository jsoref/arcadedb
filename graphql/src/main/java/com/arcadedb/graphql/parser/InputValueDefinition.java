/* Generated by: JJTree: Do not edit this line. InputValueDefinition.java Version 1.1 */
/* ParserGeneratorCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.arcadedb.graphql.parser;

public class InputValueDefinition extends SimpleNode {

  protected Name         name;
  protected Type         type;
  protected DefaultValue defaultValue;
  protected Directives   directives;

  public InputValueDefinition(int id) {
    super(id);
  }

  public InputValueDefinition(GraphQLParser p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public Object jjtAccept(GraphQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public Name getName() {
    return name;
  }

  public Type getType() {
    return type;
  }

  public DefaultValue getDefaultValue() {
    return defaultValue;
  }
}
/* ParserGeneratorCC - OriginalChecksum=3e7ab536d8fa5aeec277185038c0a682 (do not edit this line) */
