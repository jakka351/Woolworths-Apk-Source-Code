package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes6.dex */
public class LazyFieldLite {

    /* renamed from: a, reason: collision with root package name */
    public volatile MessageLite f15104a;
    public volatile ByteString b;

    static {
        ExtensionRegistryLite.b();
    }

    public final int a() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.f15104a != null) {
            return this.f15104a.getSerializedSize();
        }
        return 0;
    }

    public final MessageLite b(MessageLite messageLite) {
        if (this.f15104a == null) {
            synchronized (this) {
                if (this.f15104a == null) {
                    try {
                        this.f15104a = messageLite;
                        this.b = ByteString.e;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f15104a = messageLite;
                        this.b = ByteString.e;
                    }
                }
            }
        }
        return this.f15104a;
    }

    public final ByteString c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.f15104a == null) {
                    this.b = ByteString.e;
                } else {
                    this.b = this.f15104a.toByteString();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f15104a;
        MessageLite messageLite2 = lazyFieldLite.f15104a;
        return (messageLite == null && messageLite2 == null) ? c().equals(lazyFieldLite.c()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.b(messageLite.getDefaultInstanceForType())) : b(messageLite2.getDefaultInstanceForType()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
