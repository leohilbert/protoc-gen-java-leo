// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: java/src/main/proto/test.proto

package com.example.tutorial;

public final class TestProtos {
  private TestProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Test_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Test_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036java/src/main/proto/test.proto\022\010tutori" +
      "al\"@\n\004Test\022\022\n\004name\030\001 \001(\tR\004name\022\016\n\002id\030\002 \001" +
      "(\005R\002id\022\024\n\005email\030\003 \001(\tR\005emailB$\n\024com.exam" +
      "ple.tutorialB\nTestProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tutorial_Test_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Test_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Test_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}