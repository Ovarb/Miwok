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
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**constant for NO IMAGE case*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /**audio ID for the word */
    private int mAudioResourceId;

    /**create a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is know (such as English)
     *
     * @param miwokTranslation is the word in Miwok language
     *
     * @param audioResourceId is the audio resource ID for the audio associated to the word
     *
     * */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**create a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is know (such as English)
     *
     * @param miwokTranslation is the word in Miwok language
     *
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     * @param audioResourceId is the audio resource ID for the audio associated to the word
     *
     * */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
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
    public int getImageResourceId() {
        return this.mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return this.mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the Audio Resource ID.
     */
    public int getAudioResourceId() {
        return this.mAudioResourceId;
    }

}
