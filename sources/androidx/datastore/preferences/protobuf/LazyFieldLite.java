package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class LazyFieldLite {

    /* renamed from: a, reason: collision with root package name */
    public volatile MessageLite f2651a;
    public volatile ByteString b;

    public final MessageLite a(MessageLite messageLite) {
        if (this.f2651a == null) {
            synchronized (this) {
                if (this.f2651a == null) {
                    try {
                        this.f2651a = messageLite;
                        this.b = ByteString.e;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f2651a = messageLite;
                        this.b = ByteString.e;
                    }
                }
            }
        }
        return this.f2651a;
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
                if (this.f2651a == null) {
                    this.b = ByteString.e;
                } else {
                    this.b = this.f2651a.toByteString();
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
        MessageLite messageLite = this.f2651a;
        MessageLite messageLite2 = lazyFieldLite.f2651a;
        return (messageLite == null && messageLite2 == null) ? b().equals(lazyFieldLite.b()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.a(messageLite.a())) : a(messageLite2.a()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
