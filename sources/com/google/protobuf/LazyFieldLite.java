package com.google.protobuf;

/* loaded from: classes.dex */
public class LazyFieldLite {

    /* renamed from: a, reason: collision with root package name */
    public volatile MessageLite f16060a;
    public volatile ByteString b;

    static {
        ExtensionRegistryLite.b();
    }

    public final MessageLite a(MessageLite messageLite) {
        if (this.f16060a == null) {
            synchronized (this) {
                if (this.f16060a == null) {
                    try {
                        this.f16060a = messageLite;
                        this.b = ByteString.e;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f16060a = messageLite;
                        this.b = ByteString.e;
                    }
                }
            }
        }
        return this.f16060a;
    }

    public final ByteString b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.f16060a == null) {
                    this.b = ByteString.e;
                } else {
                    this.b = this.f16060a.toByteString();
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
        MessageLite messageLite = this.f16060a;
        MessageLite messageLite2 = lazyFieldLite.f16060a;
        return (messageLite == null && messageLite2 == null) ? b().equals(lazyFieldLite.b()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.a(messageLite.a())) : a(messageLite2.a()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
