package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /**Default English translation for the word */
    private String mDefaultTranslation;

    /**Miwok translation for the word */
    private String mMiwokTranslation;

    /**image ID for the word */
    private int mImageResourceID;

    public Word() {
        mMiwokTranslation = "";
        mDefaultTranslation = "";
        mImageResourceID = 0;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return this.mMiwokTranslation;
    }

    /**
     * Get the Image Resource ID.
     */
    public int getImageResourceID() {
        return this.mImageResourceID;
    }





}
