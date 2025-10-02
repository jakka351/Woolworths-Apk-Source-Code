package au.com.woolworths.shop.auth.keycloak;

import androidx.constraintlayout.core.state.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthEnvironment;", "", "Qa", "Uat", "Prod", "Companion", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface KeycloakAuthEnvironment {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthEnvironment$Companion;", "", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthEnvironment$Prod;", "Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthEnvironment;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Prod implements KeycloakAuthEnvironment {

        /* renamed from: a, reason: collision with root package name */
        public final String f10232a;
        public final String b;
        public final String c;
        public final String d;
        public final Map e;

        public Prod() {
            Map map = EmptyMap.d;
            this.f10232a = "https://iam.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/auth";
            this.b = "https://iam.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/token";
            this.c = "https://iam.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/logout";
            this.d = "nz.co.woolworths.mobile://auth";
            this.e = map;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: a, reason: from getter */
        public final Map getE() {
            return this.e;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: d, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: getAuthUrl, reason: from getter */
        public final String getF10234a() {
            return this.f10232a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthEnvironment$Qa;", "Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthEnvironment;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Qa implements KeycloakAuthEnvironment {

        /* renamed from: a, reason: collision with root package name */
        public final String f10233a;
        public final String b;
        public final String c;
        public final String d;
        public final Map e;

        public Qa() {
            Map mapS = a.s("CDXQAAccess", "");
            this.f10233a = "https://iam-qa.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/auth";
            this.b = "https://iam-qa.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/token";
            this.c = "https://iam-qa.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/logout";
            this.d = "nz.co.woolworths.mobile://auth";
            this.e = mapS;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: a, reason: from getter */
        public final Map getE() {
            return this.e;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: d, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: getAuthUrl, reason: from getter */
        public final String getF10234a() {
            return this.f10233a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthEnvironment$Uat;", "Lau/com/woolworths/shop/auth/keycloak/KeycloakAuthEnvironment;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Uat implements KeycloakAuthEnvironment {

        /* renamed from: a, reason: collision with root package name */
        public final String f10234a;
        public final String b;
        public final String c;
        public final String d;
        public final Map e;

        public Uat() {
            Map mapS = a.s("CDXQAAccess", "");
            this.f10234a = "https://iam-uat.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/auth";
            this.b = "https://iam-uat.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/token";
            this.c = "https://iam-uat.woolworths.co.nz/realms/wwnz-customers-mobile/protocol/openid-connect/logout";
            this.d = "nz.co.woolworths.mobile://auth";
            this.e = mapS;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: a, reason: from getter */
        public final Map getE() {
            return this.e;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: d, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // au.com.woolworths.shop.auth.keycloak.KeycloakAuthEnvironment
        /* renamed from: getAuthUrl, reason: from getter */
        public final String getF10234a() {
            return this.f10234a;
        }
    }

    /* renamed from: a */
    Map getE();

    /* renamed from: b */
    String getD();

    /* renamed from: c */
    String getB();

    /* renamed from: d */
    String getC();

    /* renamed from: getAuthUrl */
    String getF10234a();
}
