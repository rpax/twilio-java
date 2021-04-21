/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.TwiML;

import java.util.HashMap;
import java.util.Map;

/**
 * TwiML wrapper for {@code <Say>}
 */
public class Say extends TwiML {
    public enum Voice {
        MAN("man"),
        WOMAN("woman"),
        ALICE("alice"),
        POLLY_ADITI("Polly.Aditi"),
        POLLY_AMY("Polly.Amy"),
        POLLY_ASTRID("Polly.Astrid"),
        POLLY_BIANCA("Polly.Bianca"),
        POLLY_BRIAN("Polly.Brian"),
        POLLY_CAMILA("Polly.Camila"),
        POLLY_CARLA("Polly.Carla"),
        POLLY_CARMEN("Polly.Carmen"),
        POLLY_CELINE("Polly.Celine"),
        POLLY_CHANTAL("Polly.Chantal"),
        POLLY_CONCHITA("Polly.Conchita"),
        POLLY_CRISTIANO("Polly.Cristiano"),
        POLLY_DORA("Polly.Dora"),
        POLLY_EMMA("Polly.Emma"),
        POLLY_ENRIQUE("Polly.Enrique"),
        POLLY_EWA("Polly.Ewa"),
        POLLY_FILIZ("Polly.Filiz"),
        POLLY_GERAINT("Polly.Geraint"),
        POLLY_GIORGIO("Polly.Giorgio"),
        POLLY_GWYNETH("Polly.Gwyneth"),
        POLLY_HANS("Polly.Hans"),
        POLLY_INES("Polly.Ines"),
        POLLY_IVY("Polly.Ivy"),
        POLLY_JACEK("Polly.Jacek"),
        POLLY_JAN("Polly.Jan"),
        POLLY_JOANNA("Polly.Joanna"),
        POLLY_JOEY("Polly.Joey"),
        POLLY_JUSTIN("Polly.Justin"),
        POLLY_KARL("Polly.Karl"),
        POLLY_KENDRA("Polly.Kendra"),
        POLLY_KIMBERLY("Polly.Kimberly"),
        POLLY_LEA("Polly.Lea"),
        POLLY_LIV("Polly.Liv"),
        POLLY_LOTTE("Polly.Lotte"),
        POLLY_LUCIA("Polly.Lucia"),
        POLLY_LUPE("Polly.Lupe"),
        POLLY_MADS("Polly.Mads"),
        POLLY_MAJA("Polly.Maja"),
        POLLY_MARLENE("Polly.Marlene"),
        POLLY_MATHIEU("Polly.Mathieu"),
        POLLY_MATTHEW("Polly.Matthew"),
        POLLY_MAXIM("Polly.Maxim"),
        POLLY_MIA("Polly.Mia"),
        POLLY_MIGUEL("Polly.Miguel"),
        POLLY_MIZUKI("Polly.Mizuki"),
        POLLY_NAJA("Polly.Naja"),
        POLLY_NICOLE("Polly.Nicole"),
        POLLY_PENELOPE("Polly.Penelope"),
        POLLY_RAVEENA("Polly.Raveena"),
        POLLY_RICARDO("Polly.Ricardo"),
        POLLY_RUBEN("Polly.Ruben"),
        POLLY_RUSSELL("Polly.Russell"),
        POLLY_SALLI("Polly.Salli"),
        POLLY_SEOYEON("Polly.Seoyeon"),
        POLLY_TAKUMI("Polly.Takumi"),
        POLLY_TATYANA("Polly.Tatyana"),
        POLLY_VICKI("Polly.Vicki"),
        POLLY_VITORIA("Polly.Vitoria"),
        POLLY_ZEINA("Polly.Zeina"),
        POLLY_ZHIYU("Polly.Zhiyu"),
        POLLY_AMY_NEURAL("Polly.Amy-Neural"),
        POLLY_EMMA_NEURAL("Polly.Emma-Neural"),
        POLLY_BRIAN_NEURAL("Polly.Brian-Neural"),
        POLLY_SALLI_NEURAL("Polly.Salli-Neural"),
        POLLY_IVY_NEURAL("Polly.Ivy-Neural"),
        POLLY_JOANNA_NEURAL("Polly.Joanna-Neural"),
        POLLY_KENDRA_NEURAL("Polly.Kendra-Neural"),
        POLLY_KIMBERLY_NEURAL("Polly.Kimberly-Neural"),
        POLLY_JOEY_NEURAL("Polly.Joey-Neural"),
        POLLY_JUSTIN_NEURAL("Polly.Justin-Neural"),
        POLLY_MATTHEW_NEURAL("Polly.Matthew-Neural"),
        POLLY_CAMILA_NEURAL("Polly.Camila-Neural"),
        POLLY_LUPE_NEURAL("Polly.Lupe-Neural"),
        POLLY_OLIVIA_NEURAL("Polly.Olivia-Neural"),
        POLLY_KEVIN_NEURAL("Polly.Kevin-Neural");

        private final String value;

        private Voice(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    public enum Language {
        ARB("arb"),
        CA_ES("ca-ES"),
        CY_GB("cy-GB"),
        DA_DK("da-DK"),
        DE_DE("de-DE"),
        EN_AU("en-AU"),
        EN_CA("en-CA"),
        EN_GB("en-GB"),
        EN_GB_WLS("en-GB-WLS"),
        EN_IN("en-IN"),
        EN_US("en-US"),
        ES_ES("es-ES"),
        ES_MX("es-MX"),
        ES_US("es-US"),
        FI_FI("fi-FI"),
        FR_CA("fr-CA"),
        FR_FR("fr-FR"),
        HI_IN("hi-IN"),
        IS_IS("is-IS"),
        IT_IT("it-IT"),
        JA_JP("ja-JP"),
        KO_KR("ko-KR"),
        NB_NO("nb-NO"),
        NL_NL("nl-NL"),
        PL_PL("pl-PL"),
        PT_BR("pt-BR"),
        PT_PT("pt-PT"),
        RO_RO("ro-RO"),
        RU_RU("ru-RU"),
        SV_SE("sv-SE"),
        TR_TR("tr-TR"),
        ZH_CN("zh-CN"),
        ZH_HK("zh-HK"),
        ZH_TW("zh-TW");

        private final String value;

        private Language(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    private final Say.Voice voice;
    private final Integer loop;
    private final Say.Language language;
    private final String message;

    /**
     * For XML Serialization/Deserialization
     */
    private Say() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Say>} element
     */
    private Say(Builder b) {
        super("Say", b);
        this.voice = b.voice;
        this.loop = b.loop;
        this.language = b.language;
        this.message = b.message;
    }

    /**
     * The body of the TwiML element
     *
     * @return Element body as a string if present else null
     */
    protected String getElementBody() {
        return this.getMessage() == null ? null : this.getMessage();
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getVoice() != null) {
            attrs.put("voice", this.getVoice().toString());
        }
        if (this.getLoop() != null) {
            attrs.put("loop", this.getLoop().toString());
        }
        if (this.getLanguage() != null) {
            attrs.put("language", this.getLanguage().toString());
        }

        return attrs;
    }

    /**
     * Voice to use
     *
     * @return Voice to use
     */
    public Say.Voice getVoice() {
        return voice;
    }

    /**
     * Times to loop message
     *
     * @return Times to loop message
     */
    public Integer getLoop() {
        return loop;
    }

    /**
     * Message langauge
     *
     * @return Message langauge
     */
    public Say.Language getLanguage() {
        return language;
    }

    /**
     * Message to say
     *
     * @return Message to say
     */
    public String getMessage() {
        return message;
    }

    /**
     * Create a new {@code <Say>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        private Say.Voice voice;
        private Integer loop;
        private Say.Language language;
        private String message;

        /**
         * Create a {@code <Say>} with message
         */
        public Builder(String message) {
            this.message = message;
        }

        /**
         * Create a {@code <Say>} with child elements
         */
        public Builder() {
        }

        /**
         * Voice to use
         */
        public Builder voice(Say.Voice voice) {
            this.voice = voice;
            return this;
        }

        /**
         * Times to loop message
         */
        public Builder loop(Integer loop) {
            this.loop = loop;
            return this;
        }

        /**
         * Message langauge
         */
        public Builder language(Say.Language language) {
            this.language = language;
            return this;
        }

        /**
         * Add a child {@code <break>} element
         */
        public Builder break_(SsmlBreak ssmlBreak) {
            this.children.add(ssmlBreak);
            return this;
        }

        /**
         * Add a child {@code <emphasis>} element
         */
        public Builder emphasis(SsmlEmphasis ssmlEmphasis) {
            this.children.add(ssmlEmphasis);
            return this;
        }

        /**
         * Add a child {@code <lang>} element
         */
        public Builder lang(SsmlLang ssmlLang) {
            this.children.add(ssmlLang);
            return this;
        }

        /**
         * Add a child {@code <p>} element
         */
        public Builder p(SsmlP ssmlP) {
            this.children.add(ssmlP);
            return this;
        }

        /**
         * Add a child {@code <phoneme>} element
         */
        public Builder phoneme(SsmlPhoneme ssmlPhoneme) {
            this.children.add(ssmlPhoneme);
            return this;
        }

        /**
         * Add a child {@code <prosody>} element
         */
        public Builder prosody(SsmlProsody ssmlProsody) {
            this.children.add(ssmlProsody);
            return this;
        }

        /**
         * Add a child {@code <s>} element
         */
        public Builder s(SsmlS ssmlS) {
            this.children.add(ssmlS);
            return this;
        }

        /**
         * Add a child {@code <say-as>} element
         */
        public Builder sayAs(SsmlSayAs ssmlSayAs) {
            this.children.add(ssmlSayAs);
            return this;
        }

        /**
         * Add a child {@code <sub>} element
         */
        public Builder sub(SsmlSub ssmlSub) {
            this.children.add(ssmlSub);
            return this;
        }

        /**
         * Add a child {@code <w>} element
         */
        public Builder w(SsmlW ssmlW) {
            this.children.add(ssmlW);
            return this;
        }

        /**
         * Create and return resulting {@code <Say>} element
         */
        public Say build() {
            return new Say(this);
        }
    }
}