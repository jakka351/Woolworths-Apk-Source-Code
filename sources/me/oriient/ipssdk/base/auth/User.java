package me.oriient.ipssdk.base.auth;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.auth.Space;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010'\u001a\u00020\rJ\u0006\u0010(\u001a\u00020\rJ\u0010\u0010)\u001a\u0004\u0018\u00010\b2\u0006\u0010*\u001a\u00020\rJ\u0006\u0010+\u001a\u00020\rJ\u0010\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0000J\b\u0010/\u001a\u00020\rH\u0016R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b \u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b&\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Lme/oriient/ipssdk/base/auth/User;", "", "userName", "Lme/oriient/ipssdk/base/auth/Username;", "apiKey", "Lme/oriient/ipssdk/base/auth/ApiKey;", "availableSpaces", "", "Lme/oriient/internal/services/auth/Space;", "space", "domain", "Lme/oriient/ipssdk/base/auth/Domain;", "sessionId", "", "createdAtMillis", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lme/oriient/internal/services/auth/Space;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApiKey-7MOle28", "()Ljava/lang/String;", "Ljava/lang/String;", "availableSpaceIds", "", "getAvailableSpaceIds", "()Ljava/util/Set;", "", "getAvailableSpaces", "()Ljava/util/Map;", "availableSpacesList", "getAvailableSpacesList", "()Ljava/util/List;", "getCreatedAtMillis", "()J", "getDomain-2cSLe5A", "getSessionId", "getSpace", "()Lme/oriient/internal/services/auth/Space;", "setSpace", "(Lme/oriient/internal/services/auth/Space;)V", "getUserName-p0PYeN0", "getApiKeyJava", "getDomainJava", "getSpaceIfAvailable", "id", "getUserNameJava", "isSameAs", "", "user", "toString", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class User {

    @NotNull
    private final String apiKey;

    @NotNull
    private final Map<String, Space> availableSpaces;
    private final long createdAtMillis;

    @NotNull
    private final String domain;

    @NotNull
    private final String sessionId;

    @NotNull
    private Space space;

    @NotNull
    private final String userName;

    public /* synthetic */ User(String str, String str2, List list, Space space, String str3, String str4, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, space, str3, str4, j);
    }

    @NotNull
    /* renamed from: getApiKey-7MOle28, reason: not valid java name and from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    public final String getApiKeyJava() {
        return this.apiKey;
    }

    @NotNull
    public final Set<String> getAvailableSpaceIds() {
        return this.availableSpaces.keySet();
    }

    @NotNull
    public final Map<String, Space> getAvailableSpaces() {
        return this.availableSpaces;
    }

    @NotNull
    public final List<Space> getAvailableSpacesList() {
        Collection<Space> collectionValues = this.availableSpaces.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add((Space) it.next());
        }
        return arrayList;
    }

    public final long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    @NotNull
    /* renamed from: getDomain-2cSLe5A, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getDomainJava() {
        return this.domain;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final Space getSpace() {
        return this.space;
    }

    @Nullable
    public final Space getSpaceIfAvailable(@NotNull String id) {
        Intrinsics.h(id, "id");
        return this.availableSpaces.get(id);
    }

    @NotNull
    /* renamed from: getUserName-p0PYeN0, reason: not valid java name and from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final String getUserNameJava() {
        return this.userName;
    }

    public final boolean isSameAs(@Nullable User user) {
        return user != null && Username.m430equalsimpl0(user.userName, this.userName) && ApiKey.m399equalsimpl0(user.apiKey, this.apiKey) && Domain.m406equalsimpl0(user.domain, this.domain);
    }

    public final void setSpace(@NotNull Space space) {
        Intrinsics.h(space, "<set-?>");
        this.space = space;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("User(userName=");
        sb.append((Object) Username.m432toStringimpl(this.userName));
        sb.append(", apiKey=");
        sb.append((Object) ApiKey.m401toStringimpl(this.apiKey));
        sb.append(", space=");
        sb.append(this.space);
        sb.append(", ipsName='");
        sb.append((Object) Domain.m408toStringimpl(this.domain));
        sb.append("', sessionId='");
        sb.append(this.sessionId);
        sb.append("', availableSpaces=");
        return b.r(sb, this.availableSpaces.size() > 3 ? String.valueOf(this.availableSpaces.size()) : this.availableSpaces.toString(), ')');
    }

    private User(String userName, String apiKey, List<Space> availableSpaces, Space space, String domain, String sessionId, long j) {
        Intrinsics.h(userName, "userName");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(availableSpaces, "availableSpaces");
        Intrinsics.h(space, "space");
        Intrinsics.h(domain, "domain");
        Intrinsics.h(sessionId, "sessionId");
        this.userName = userName;
        this.apiKey = apiKey;
        this.space = space;
        this.domain = domain;
        this.sessionId = sessionId;
        this.createdAtMillis = j;
        this.availableSpaces = new HashMap();
        for (Space space2 : availableSpaces) {
            this.availableSpaces.put(space2.getId(), space2);
        }
    }
}
