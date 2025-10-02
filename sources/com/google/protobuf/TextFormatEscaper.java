package com.google.protobuf;

/* loaded from: classes6.dex */
final class TextFormatEscaper {

    /* renamed from: com.google.protobuf.TextFormatEscaper$1, reason: invalid class name */
    class AnonymousClass1 implements ByteSequence {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteString f16086a;

        public AnonymousClass1(ByteString byteString) {
            this.f16086a = byteString;
        }
    }

    /* renamed from: com.google.protobuf.TextFormatEscaper$2, reason: invalid class name */
    class AnonymousClass2 implements ByteSequence {
    }

    public interface ByteSequence {
    }

    public static String a(ByteString byteString) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(byteString);
        StringBuilder sb = new StringBuilder(byteString.size());
        int i = 0;
        while (true) {
            ByteString byteString2 = anonymousClass1.f16086a;
            if (i >= byteString2.size()) {
                return sb.toString();
            }
            byte bG = byteString2.g(i);
            if (bG == 34) {
                sb.append("\\\"");
            } else if (bG == 39) {
                sb.append("\\'");
            } else if (bG != 92) {
                switch (bG) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bG >= 32 && bG <= 126) {
                            sb.append((char) bG);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bG >>> 6) & 3) + 48));
                            sb.append((char) (((bG >>> 3) & 7) + 48));
                            sb.append((char) ((bG & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
            i++;
        }
    }
}
