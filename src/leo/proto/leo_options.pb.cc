// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leo_options.proto

#include "leo_options.pb.h"

#include <algorithm>

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/wire_format_lite.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>
namespace leo {
namespace proto {
}  // namespace proto
}  // namespace leo
static constexpr ::PROTOBUF_NAMESPACE_ID::Metadata* file_level_metadata_leo_5foptions_2eproto = nullptr;
static constexpr ::PROTOBUF_NAMESPACE_ID::EnumDescriptor const** file_level_enum_descriptors_leo_5foptions_2eproto = nullptr;
static constexpr ::PROTOBUF_NAMESPACE_ID::ServiceDescriptor const** file_level_service_descriptors_leo_5foptions_2eproto = nullptr;
const ::PROTOBUF_NAMESPACE_ID::uint32 TableStruct_leo_5foptions_2eproto::offsets[1] = {};
static constexpr ::PROTOBUF_NAMESPACE_ID::internal::MigrationSchema* schemas = nullptr;
static constexpr ::PROTOBUF_NAMESPACE_ID::Message* const* file_default_instances = nullptr;

const char descriptor_table_protodef_leo_5foptions_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\021leo_options.proto\022\tleo.proto\032 google/p"
  "rotobuf/descriptor.proto:1\n\010javatype\022\035.g"
  "oogle.protobuf.FieldOptions\030\242\220\003 \001(\t:=\n\025u"
  "se_custom_superclass\022\034.google.protobuf.F"
  "ileOptions\030\243\220\003 \001(\010:<\n\024implements_interfa"
  "ce\022\034.google.protobuf.FileOptions\030\245\220\003 \001(\t"
  ":D\n\031msg_use_custom_superclass\022\037.google.p"
  "rotobuf.MessageOptions\030\244\220\003 \001(\010:C\n\030msg_im"
  "plements_interface\022\037.google.protobuf.Mes"
  "sageOptions\030\246\220\003 \001(\tb\006proto3"
  ;
static const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable*const descriptor_table_leo_5foptions_2eproto_deps[1] = {
  &::descriptor_table_google_2fprotobuf_2fdescriptor_2eproto,
};
static ::PROTOBUF_NAMESPACE_ID::internal::SCCInfoBase*const descriptor_table_leo_5foptions_2eproto_sccs[1] = {
};
static ::PROTOBUF_NAMESPACE_ID::internal::once_flag descriptor_table_leo_5foptions_2eproto_once;
const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_leo_5foptions_2eproto = {
  false, false, descriptor_table_protodef_leo_5foptions_2eproto, "leo_options.proto", 387,
  &descriptor_table_leo_5foptions_2eproto_once, descriptor_table_leo_5foptions_2eproto_sccs, descriptor_table_leo_5foptions_2eproto_deps, 0, 1,
  schemas, file_default_instances, TableStruct_leo_5foptions_2eproto::offsets,
  file_level_metadata_leo_5foptions_2eproto, 0, file_level_enum_descriptors_leo_5foptions_2eproto, file_level_service_descriptors_leo_5foptions_2eproto,
};

// Force running AddDescriptors() at dynamic initialization time.
static bool dynamic_init_dummy_leo_5foptions_2eproto = (static_cast<void>(::PROTOBUF_NAMESPACE_ID::internal::AddDescriptors(&descriptor_table_leo_5foptions_2eproto)), true);
namespace leo {
namespace proto {
const std::string javatype_default("");
::PROTOBUF_NAMESPACE_ID::internal::ExtensionIdentifier< ::google::protobuf::FieldOptions,
    ::PROTOBUF_NAMESPACE_ID::internal::StringTypeTraits, 9, false >
  javatype(kJavatypeFieldNumber, javatype_default);
::PROTOBUF_NAMESPACE_ID::internal::ExtensionIdentifier< ::google::protobuf::FileOptions,
    ::PROTOBUF_NAMESPACE_ID::internal::PrimitiveTypeTraits< bool >, 8, false >
  use_custom_superclass(kUseCustomSuperclassFieldNumber, false);
const std::string implements_interface_default("");
::PROTOBUF_NAMESPACE_ID::internal::ExtensionIdentifier< ::google::protobuf::FileOptions,
    ::PROTOBUF_NAMESPACE_ID::internal::StringTypeTraits, 9, false >
  implements_interface(kImplementsInterfaceFieldNumber, implements_interface_default);
::PROTOBUF_NAMESPACE_ID::internal::ExtensionIdentifier< ::google::protobuf::MessageOptions,
    ::PROTOBUF_NAMESPACE_ID::internal::PrimitiveTypeTraits< bool >, 8, false >
  msg_use_custom_superclass(kMsgUseCustomSuperclassFieldNumber, false);
const std::string msg_implements_interface_default("");
::PROTOBUF_NAMESPACE_ID::internal::ExtensionIdentifier< ::google::protobuf::MessageOptions,
    ::PROTOBUF_NAMESPACE_ID::internal::StringTypeTraits, 9, false >
  msg_implements_interface(kMsgImplementsInterfaceFieldNumber, msg_implements_interface_default);

// @@protoc_insertion_point(namespace_scope)
}  // namespace proto
}  // namespace leo
PROTOBUF_NAMESPACE_OPEN
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>
