package com.tealium.core.network;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/tealium/core/network/ResponseStatus;", "", "Cancelled", "Non200Response", "NotConnected", "Success", "UnknownError", "Lcom/tealium/core/network/ResponseStatus$Success;", "Lcom/tealium/core/network/ResponseStatus$Cancelled;", "Lcom/tealium/core/network/ResponseStatus$NotConnected;", "Lcom/tealium/core/network/ResponseStatus$UnknownError;", "Lcom/tealium/core/network/ResponseStatus$Non200Response;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ResponseStatus {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/ResponseStatus$Cancelled;", "Lcom/tealium/core/network/ResponseStatus;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Cancelled extends ResponseStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final Cancelled f19162a = new Cancelled();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/ResponseStatus$Non200Response;", "Lcom/tealium/core/network/ResponseStatus;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class Non200Response extends ResponseStatus {

        /* renamed from: a, reason: collision with root package name */
        public final int f19163a;

        public Non200Response(int i) {
            this.f19163a = i;
        }

        /* renamed from: a, reason: from getter */
        public final int getF19163a() {
            return this.f19163a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/ResponseStatus$NotConnected;", "Lcom/tealium/core/network/ResponseStatus;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class NotConnected extends ResponseStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final NotConnected f19164a = new NotConnected();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/ResponseStatus$Success;", "Lcom/tealium/core/network/ResponseStatus;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Success extends ResponseStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final Success f19165a = new Success();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/ResponseStatus$UnknownError;", "Lcom/tealium/core/network/ResponseStatus;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class UnknownError extends ResponseStatus {
    }
}
