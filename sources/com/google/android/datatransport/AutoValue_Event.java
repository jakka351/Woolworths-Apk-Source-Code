package com.google.android.datatransport;

/* loaded from: classes.dex */
final class AutoValue_Event<T> extends Event<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14386a;
    public final Priority b;
    public final ProductData c;

    public AutoValue_Event(Object obj, Priority priority, ProductData productData) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f14386a = obj;
        this.b = priority;
        this.c = productData;
    }

    @Override // com.google.android.datatransport.Event
    public final Integer a() {
        return null;
    }

    @Override // com.google.android.datatransport.Event
    public final EventContext b() {
        return null;
    }

    @Override // com.google.android.datatransport.Event
    public final Object c() {
        return this.f14386a;
    }

    @Override // com.google.android.datatransport.Event
    public final Priority d() {
        return this.b;
    }

    @Override // com.google.android.datatransport.Event
    public final ProductData e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (event.a() != null || !this.f14386a.equals(event.c()) || !this.b.equals(event.d())) {
            return false;
        }
        ProductData productData = this.c;
        if (productData == null) {
            if (event.e() != null) {
                return false;
            }
        } else if (!productData.equals(event.e())) {
            return false;
        }
        return event.b() == null;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f14386a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        ProductData productData = this.c;
        return (iHashCode ^ (productData == null ? 0 : productData.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f14386a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
