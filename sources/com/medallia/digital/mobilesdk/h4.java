package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.MDExternalError;

/* loaded from: classes6.dex */
class h4 extends a3 {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a W;
        public static final a X;
        public static final a Y;
        public static final a Z;
        public static final a a0;
        public static final a b0;
        public static final a c0;
        public static final a d;
        public static final a d0;
        public static final a e;
        public static final a e0;
        public static final a f;
        public static final a f0;
        public static final a g;
        public static final a g0;
        public static final a h;
        private static final /* synthetic */ a[] h0;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;

        /* renamed from: a, reason: collision with root package name */
        private final int f16507a;
        private final String b;
        private final MDExternalError.ExternalError c;

        static {
            MDExternalError.ExternalError externalError = MDExternalError.ExternalError.API_TOKEN_NOT_VALID;
            a aVar = new a("API_TOKEN_PARSE_ERROR", 0, 2001, externalError, "Could not parse ApiToken");
            d = aVar;
            MDExternalError.ExternalError externalError2 = MDExternalError.ExternalError.AUTHORIZATION_FAILED_20;
            a aVar2 = new a("API_TOKEN_PROPERTY_ID_NO_DATA", 1, 2002, externalError2, "Property id is missing");
            e = aVar2;
            a aVar3 = new a("API_TOKEN_TOKEN_FIELD_NO_DATA", 2, 2003, externalError2, "Token data is missing");
            f = aVar3;
            a aVar4 = new a("EMPTY_AUTH_GW", 3, 2004, externalError2, "Auth url is missing");
            g = aVar4;
            a aVar5 = new a("EMPTY_AUTH_GW_1", 4, 20041, MDExternalError.ExternalError.AUTHORIZATION_FAILED_17, "Auth url is missing");
            h = aVar5;
            a aVar6 = new a("AUTH_NETWORK_ERROR", 5, 2005, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE, "Authenticate network error");
            i = aVar6;
            a aVar7 = new a("AUTH_NETWORK_ERROR_1", 6, 20051, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_11, "Authenticate network error");
            j = aVar7;
            MDExternalError.ExternalError externalError3 = MDExternalError.ExternalError.REQUEST_TIMEOUT;
            a aVar8 = new a("AUTH_TIMEOUT", 7, 2006, externalError3, "Authenticate timeout error");
            k = aVar8;
            a aVar9 = new a("API_TOKEN_EMPTY", 8, 2007, externalError, "Api token is empty");
            l = aVar9;
            a aVar10 = new a("ACCESS_TOKEN_PARSE_LOCAL", 9, 2020, MDExternalError.ExternalError.AUTHORIZATION_FAILED_18, "Could not parse AccessToken");
            m = aVar10;
            a aVar11 = new a("ACCESS_TOKEN_PARSE", 10, 2021, MDExternalError.ExternalError.AUTHORIZATION_FAILED_19, "Could not parse AccessToken");
            n = aVar11;
            a aVar12 = new a("GET_CONFIG_EMPTY_ENDPOINT", 11, 2022, externalError2, "Get config url is missing");
            o = aVar12;
            a aVar13 = new a("ACCESS_PROPERTY_ID_NO_DATA", 12, 2023, externalError2, "Property id is missing");
            p = aVar13;
            a aVar14 = new a("CREATION_DATE_NO_DATA", 13, 2024, externalError2, "Create time is missing");
            q = aVar14;
            a aVar15 = new a("TTL_NO_DATA", 14, 2025, externalError2, "Ttl is missing");
            r = aVar15;
            a aVar16 = new a("ACCESS_TOKEN_TOKEN_FIELD_NO_DATA", 15, 2026, externalError2, "Token data is missing");
            s = aVar16;
            a aVar17 = new a("ACCESS_TOKEN_EMPTY", 16, 2027, externalError, "Access token is empty");
            t = aVar17;
            a aVar18 = new a("UUID_EMPTY", 17, 2028, null, "UUID is empty");
            u = aVar18;
            a aVar19 = new a("RESOURCE_EMPTY_ENDPOINT", 18, 2029, null, "Resource endpoint is missing");
            v = aVar19;
            MDExternalError.ExternalError externalError4 = MDExternalError.ExternalError.SERVER_COM_ERROR;
            a aVar20 = new a("GET_CONFIG_ERROR", 19, 2041, externalError4, "Get configuration error");
            w = aVar20;
            a aVar21 = new a("CONFIGURATION_TIMEOUT", 20, 2042, externalError3, "Configuration timeout");
            x = aVar21;
            a aVar22 = new a("CONFIGURATION", 21, 2043, externalError4, "Could not create configuration");
            y = aVar22;
            a aVar23 = new a("EMPTY_CONFIGURATION", 22, 2044, externalError4, "Configuration is empty");
            z = aVar23;
            a aVar24 = new a("LOCAL_CONFIGURATION_IS_NOT_AVAILABLE", 23, 2045, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_13, "Local configuration file is not available");
            A = aVar24;
            a aVar25 = new a("LOCAL_CONFIGURATION_TS_IS_NOT_AVAILABLE", 24, 2046, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_14, "Local configuration timestamp is not available");
            B = aVar25;
            a aVar26 = new a("LOCAL_CONFIGURATION_IS_EXPIRED", 25, 2047, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_15, "Local configuration is expired");
            C = aVar26;
            a aVar27 = new a("REMOTE_CONFIGURATION_AUTH_FAILED", 26, 2048, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_16, "Remote configuration authentication failed");
            D = aVar27;
            a aVar28 = new a("REMOTE_CONFIGURATION_IS_CORRUPTED", 27, 2049, null, "Remote configuration is corrupted or not available");
            E = aVar28;
            a aVar29 = new a("SUBMIT_FEEDBACK_ERROR", 28, 2161, null, "Submit feedback error");
            F = aVar29;
            a aVar30 = new a("FEEDBACK_TIMEOUT", 29, 2162, externalError3, "Feedback timeout");
            G = aVar30;
            a aVar31 = new a("FEEDBACK_PARSE_ERROR", 30, 2163, null, "Could not parse feedback");
            H = aVar31;
            a aVar32 = new a("SUBMIT_FEEDBACK_EMPTY_ENDPOINT", 31, 2164, null, "Empty submit feedback endpoint");
            I = aVar32;
            a aVar33 = new a("EMPTY_FEEDBACK", 32, 2165, null, "Feedback contains no data");
            J = aVar33;
            a aVar34 = new a("DESERIALIZE_FEEDBACK", 33, 2166, null, "Deserialize Feedback failed");
            K = aVar34;
            a aVar35 = new a("DESERIALIZE_FEEDBACK_PAYLOAD", 34, 2167, null, "Deserialize Feedback payload failed");
            L = aVar35;
            a aVar36 = new a("SUBMIT_ANALYTICS_ERROR", 35, 2171, null, "Submit analytics error");
            M = aVar36;
            a aVar37 = new a("SUBMIT_ANALYTICS_EMPTY_ENDPOINT", 36, 2172, null, "Empty submit analytics endpoint");
            N = aVar37;
            a aVar38 = new a("SUBMIT_ANALYTICS_ABOVE_MAX_SIZE", 37, 2173, null, "Analytics elements is above max size element");
            O = aVar38;
            a aVar39 = new a("SUBMIT_DIGITAL_ANALYTICS_ERROR", 38, 2174, null, "Submit digital analytics error");
            P = aVar39;
            a aVar40 = new a("SUBMIT_DIGITAL_ANALYTICS_EMPTY_ENDPOINT", 39, 2175, null, "Empty submit digital analytics endpoint");
            Q = aVar40;
            a aVar41 = new a("GET_RESOURCE_ERROR", 40, 2181, null, "Get resource failed");
            R = aVar41;
            a aVar42 = new a("GET_RESOURCE_TIMEOUT", 41, 2182, externalError3, "Get resource timeout");
            S = aVar42;
            a aVar43 = new a("NO_INTERNET_CONNECTION_AVAILABLE", 42, 2183, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_13, "Internet connection is not available");
            T = aVar43;
            a aVar44 = new a("LL_GET_PRESIGNED_URL_ERROR", 43, 2401, null, "LL get presigned Url error");
            U = aVar44;
            a aVar45 = new a("LL_UPLOADING_MEDIA_ERROR", 44, 2402, null, "LL uploading media error");
            V = aVar45;
            a aVar46 = new a("LL_PROCESSING_MEDIA_ERROR", 45, 2403, null, "LL processing media error");
            W = aVar46;
            a aVar47 = new a("LL_PROCESSING_MEDIA_END_POINT", 46, 2404, null, "Empty process media endpoint");
            X = aVar47;
            a aVar48 = new a("LL_EMPTY_MEDIA_DATA_OBJECT", 47, 2405, null, "Empty media data object");
            Y = aVar48;
            a aVar49 = new a("LL_SUBMIT_MEDIA_FEEDBACK_FAILED", 48, 2406, null, "Submit media feedback failed");
            Z = aVar49;
            a aVar50 = new a("SUBMIT_MEDIA_FEEDBACK_EMPTY_ENDPOINT", 49, 2407, null, "Submit media feedback empty endpoint");
            a0 = aVar50;
            a aVar51 = new a("LL_NO_CONNECTION_AVAILABLE", 50, 2408, null, "Error no Connection Available");
            b0 = aVar51;
            a aVar52 = new a("QUARANTINE_VALIDATION_ERROR", 51, 2501, null, "Quarantine Validation Error");
            c0 = aVar52;
            a aVar53 = new a("QUARANTINE_VALIDATION_EMPTY_ENDPOINT", 52, 2502, null, "Quarantine Validation Empty Endpoint Error");
            d0 = aVar53;
            a aVar54 = new a("QUARANTINE_VALIDATION_TIMEOUT", 53, 2503, null, "Quarantine Validation TIMEOUT");
            e0 = aVar54;
            a aVar55 = new a("QUARANTINE_C_UUID_EMPTY_ENDPOINT", 54, 2504, null, "Quarantine CUUID Empty Endpoint Error");
            f0 = aVar55;
            a aVar56 = new a("QUARANTINE_NETWORK_ERROR", 55, 2505, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_14, "Internet connection is not available");
            g0 = aVar56;
            h0 = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, aVar48, aVar49, aVar50, aVar51, aVar52, aVar53, aVar54, aVar55, aVar56};
        }

        private a(String str, int i2, int i3, MDExternalError.ExternalError externalError, String str2) {
            this.f16507a = i3;
            this.b = str2;
            this.c = externalError;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h0.clone();
        }

        public int a() {
            return this.f16507a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.b;
        }

        public String b() {
            return this.b;
        }
    }

    public h4(a aVar) {
        super(aVar.f16507a, aVar.c, aVar.b);
    }
}
