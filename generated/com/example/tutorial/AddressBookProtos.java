// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: java/src/test/proto/addressbook.proto

package com.example.tutorial;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%java/src/test/proto/addressbook.proto\022" +
      "\010tutorial\032\037google/protobuf/timestamp.pro" +
      "to\"\207\002\n\006Person\022\022\n\004name\030\001 \001(\tR\004name\022\016\n\002id\030" +
      "\002 \001(\005R\002id\022\024\n\005email\030\003 \001(\tR\005email\0224\n\006phone" +
      "s\030\004 \003(\0132\034.tutorial.Person.PhoneNumberR\006p" +
      "hones\022=\n\014last_updated\030\005 \001(\0132\032.google.pro" +
      "tobuf.TimestampR\013lastUpdated\032N\n\013PhoneNum" +
      "ber\022\026\n\006number\030\001 \001(\tR\006number\022\'\n\004type\030\002 \001(" +
      "\0162\023.tutorial.PhoneTypeR\004type\"7\n\013AddressB" +
      "ook\022(\n\006people\030\001 \003(\0132\020.tutorial.PersonR\006p" +
      "eople*+\n\tPhoneType\022\n\n\006MOBILE\020\000\022\010\n\004HOME\020\001" +
      "\022\010\n\004WORK\020\002B+\n\024com.example.tutorialB\021Addr" +
      "essBookProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_tutorial_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", "LastUpdated", });
    internal_static_tutorial_Person_PhoneNumber_descriptor =
      internal_static_tutorial_Person_descriptor.getNestedTypes().get(0);
    internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_tutorial_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AddressBook_descriptor,
        new java.lang.String[] { "People", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
