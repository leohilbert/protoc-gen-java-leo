set -e
mkdir -p build
cd build || exit
cmake ..
make
cd ..

go build -o ./build/protoc-gen-debug ./protoc-gen-debug/main.go
protoc \
  --plugin=protoc-gen-debug=./build/protoc-gen-debug \
  --debug_out=./generated \
  --proto_path=./java/src/main/proto \
  --proto_path=./java/src/test/proto \
   ./java/src/test/proto/*.proto