cmake_minimum_required(VERSION 3.5)

project(helloArgos)

#set(CMAKE_BUILD_TYPE Debug)

#find_package(argos REQUIRED)

#################  find argos ####################
find_library(ARGOS_CORE_LIBRARY
  NAMES argos3core_stigbot
  PATH_SUFFIXES lib
  PATHS
  /usr/lib/argos3
)

find_library(ARGOS_PLUGIN_LIBRARY
  NAMES argos3plugin_stigbot_genericrobot
  PATH_SUFFIXES lib
  PATHS
  /usr/lib/argos3
)

#set(ARGOS_LIBRARY ${ARGOS_CORE_LIBRARY} ${ARGOS_PLUGIN_LIBRARY})
set(ARGOS_LIBRARY ${ARGOS_CORE_LIBRARY})

message(ARGOS_LIBRARY is ${ARGOS_LIBRARY})

##############  after find argos ###################



add_executable(helloArgos helloargos.cpp
			  )

target_link_libraries(helloArgos
                       ${ARGOS_LIBRARY}                       
                     )


install(TARGETS helloArgos DESTINATION bin)

