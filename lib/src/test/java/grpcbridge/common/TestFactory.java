package grpcbridge.common;

import static grpcbridge.test.proto.Test.Enum.VALID;

import com.google.protobuf.ByteString;
import grpcbridge.test.proto.Test.DeleteRequest;
import grpcbridge.test.proto.Test.DeleteResponse;
import grpcbridge.test.proto.Test.GetRequest;
import grpcbridge.test.proto.Test.GetResponse;
import grpcbridge.test.proto.Test.Nested;
import grpcbridge.test.proto.Test.PatchRequest;
import grpcbridge.test.proto.Test.PatchResponse;
import grpcbridge.test.proto.Test.PostRequest;
import grpcbridge.test.proto.Test.PostResponse;
import grpcbridge.test.proto.Test.PutRequest;
import grpcbridge.test.proto.Test.PutResponse;

public final class TestFactory {
    public static GetRequest newGetRequest() {
        return GetRequest.newBuilder()
                .setStringField("string")
                .setIntField(123)
                .setLongField(321)
                .setFloatField(45.67f)
                .setDoubleField(89.999)
                .setBoolField(true)
                .setEnumField(VALID)
                .setBytesField(ByteString.copyFrom("bytes".getBytes()))
                .setNested(Nested.newBuilder()
                        .setNestedField("nested"))
                .build();

    }

    public static GetResponse responseFor(GetRequest request) {
        return GetResponse.newBuilder()
                .setStringField(request.getStringField())
                .setIntField(request.getIntField())
                .setLongField(request.getLongField())
                .setFloatField(request.getFloatField())
                .setDoubleField(request.getDoubleField())
                .setBoolField(request.getBoolField())
                .setEnumField(request.getEnumField())
                .setBytesField(request.getBytesField())
                .setNested(request.getNested())
                .addAllRepeatedField(request.getRepeatedFieldList())
                .build();
    }

    public static PostRequest newPostRequest() {
        return PostRequest.newBuilder()
                .setIntField(123)
                .build();

    }

    public static PostResponse responseFor(PostRequest request) {
        return PostResponse.newBuilder()
                .setStringField(request.getStringField())
                .setIntField(request.getIntField())
                .build();
    }

    public static PutRequest newPutRequest() {
        return PutRequest.newBuilder()
                .build();

    }

    public static PutResponse responseFor(PutRequest request) {
        return PutResponse.newBuilder()
                .setStringField(request.getStringField())
                .build();
    }

    public static DeleteRequest newDeleteRequest() {
        return DeleteRequest.newBuilder()
                .build();

    }

    public static DeleteResponse responseFor(DeleteRequest request) {
        return DeleteResponse.newBuilder()
                .setStringField(request.getStringField())
                .build();
    }

    public static PatchRequest newPatchRequest() {
        return PatchRequest.newBuilder()
                .build();

    }

    public static PatchResponse responseFor(PatchRequest request) {
        return PatchResponse.newBuilder()
                .setStringField(request.getStringField())
                .build();
    }
}
