import os

folder_path = "D:/REPOS/MFL_DEBUG/MoreBowsAndArrows-1.20.2-forge/src/main/resources/assets/morebowsandarrows/textures/fix"  # Replace with the path to your folder

# Ensure the folder exists
if not os.path.exists(folder_path):
    print(f"The folder '{folder_path}' does not exist.")
    exit()

# List all files in the folder
file_list = os.listdir(folder_path)

# Iterate through the files and rename them
for filename in file_list:
    if "stripped_" in filename:
        new_filename = filename.replace("stripped_", "", 1)
        new_filename = f"stripped_{new_filename}"
        old_path = os.path.join(folder_path, filename)
        new_path = os.path.join(folder_path, new_filename)
        os.rename(old_path, new_path)
        print(f"Renamed: {filename} -> {new_filename}")
