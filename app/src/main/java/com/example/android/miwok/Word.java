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

    /**create a new Word object */
    public Word() {
        mMiwokTranslation = "";
        mDefaultTranslation = "";
    }

    /**create a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is know (such as English)
     *
     * @param miwokTranslation is the word in Miwok language
     *
     * */
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**create a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is know (such as English)
     *
     * @param miwokTranslation is the word in Miwok language
     *
     * @param imageResourceID is the drawable resource ID for the image associated with the word
     *
     * */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceID;
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
